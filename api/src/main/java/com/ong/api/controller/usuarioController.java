package com.ong.api.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ong.api.CryptPassword;
import com.ong.api.entity.Usuario;
import com.ong.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/usuario")
public class usuarioController {
    @Autowired
    UsuarioRepository repository;


    @GetMapping
    public List<Usuario> usuariolist(){

        return repository.findAll();
    }
    @PostMapping
    public void signUp(@RequestBody Usuario usuario){
        CryptPassword crypt = new CryptPassword();
        String hashedPassword = crypt.CryptPassword(usuario.getPassword());
        Usuario user = new Usuario(usuario.getEmail(),hashedPassword);

        repository.save(user);
    }

    @PostMapping(value = "/signin")
    public ResponseEntity<String> signIn(@RequestBody Usuario usuario) {
        CryptPassword crypt = new CryptPassword();
        Usuario existUser = repository.findByEmail(usuario.getEmail());
        if (existUser == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuário não encontrado");
        } else {
            if (crypt.DescriptedPassword(usuario.getPassword(), existUser.getPassword())) {
                return ResponseEntity.status(HttpStatus.ACCEPTED).body("Usuário encontrado");
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Senha incorreta!");
            }


        }
    }

}
