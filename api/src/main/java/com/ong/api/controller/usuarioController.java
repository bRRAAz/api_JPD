package com.ong.api.controller;

import com.ong.api.CryptPassword;
import com.ong.api.DTOs.UsuarioDTO;
import com.ong.api.entity.Usuario;
import com.ong.api.mapper.UsuarioMapper;
import com.ong.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/usuario")
public class usuarioController {
    @Autowired
    UsuarioRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<UsuarioDTO> usuariolist(){
        List<UsuarioDTO> userDTO = repository.findAll().stream().map(UsuarioMapper::toUsuarioDTO).toList();
        return userDTO;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<?> signUp(@RequestBody Usuario usuario){

        if(usuario.getEmail()==null || usuario.getEmail() == ""){
            return new ResponseEntity<>("Email vazio",HttpStatus.BAD_REQUEST);
        }
        CryptPassword crypt = new CryptPassword();
        System.out.println(usuario.getPassword());
        String hashedPassword = crypt.CryptPassword(usuario.getPassword());
        Usuario user = new Usuario(usuario.getName(),usuario.getSocialName(),hashedPassword,usuario.getPronome(),usuario.getDateBirth(),usuario.getEmail(),usuario.getTel(),usuario.getEmergencyTel(),usuario.getEntryDate(),usuario.getTeam(),usuario.getNumberOfAction(),usuario.getSetorMember(),usuario.getSetor(),usuario.getCoordinator(), usuario.getLate(), usuario.getMiss(), usuario.getGender(), usuario.getCoordinatorSetor());

        try{
             repository.save(user);
        }catch(DataIntegrityViolationException exception){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        UsuarioDTO response = UsuarioMapper.toUsuarioDTO(user);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "/signin")
    public ResponseEntity<?> signIn(@RequestBody Usuario usuario) {
        CryptPassword crypt = new CryptPassword();
        Usuario existUser = repository.findByEmail(usuario.getEmail());
        if (existUser == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuário não encontrado");
        } else {
            if (crypt.DescriptedPassword(usuario.getPassword(), existUser.getPassword())) {
                return ResponseEntity.status(HttpStatus.ACCEPTED).body(UsuarioMapper.toUsuarioDTO(existUser));
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Senha incorreta!");
            }


        }
    }
}
