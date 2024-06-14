package com.ong.api.controller;



import com.ong.api.DTOs.ReqBodyPresenca;
import com.ong.api.entity.Presenca;
import com.ong.api.entity.Usuario;
import com.ong.api.repository.AcaoRepository;
import com.ong.api.repository.PresencaRepository;
import com.ong.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping(value = "api/presenca")
public class PresencaController {

    @Autowired
    PresencaRepository repository;
    @Autowired
    UsuarioRepository userRepository;

    @GetMapping
    public List<Presenca> presencaList(){
        return repository.findAll();
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "ids")
    public List<Presenca> findAllById(@RequestBody ReqBodyPresenca json){

        return repository.findAllByUserId(json.getArrayId());
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void savePresenca(@RequestBody Presenca presenca){
        Usuario newUser = userRepository.findById(presenca.getUser().getId()).orElse(null);
        switch (presenca.getPresence()){
            case "Missed":
                newUser.setMiss(newUser.getMiss() + 1);
                userRepository.save(newUser);
                break;
            case "Late":
                newUser.setLate(newUser.getLate() + 1);
                if(newUser.getLate() > 2){
                    newUser.setLate(0);
                    newUser.setMiss(newUser.getMiss() + 1);
                }
                userRepository.save(newUser);
                break;
            case "VeryLate":
                newUser.setLate(newUser.getLate() + 2);
                if(newUser.getLate() > 2){
                    newUser.setLate(0);
                    newUser.setMiss(newUser.getMiss() + 1);
                }
                userRepository.save(newUser);
                break;
            default:

        }
        Presenca newPresenca = repository.findByActionIdAndUserId(presenca.getAction().getId(), presenca.getUser().getId());
        if(newPresenca == null){
            repository.save(presenca);
        }else {
            newPresenca.setAction(presenca.getAction());
            newPresenca.setPresence(presenca.getPresence());
            newPresenca.setUser(presenca.getUser());
            repository.save(newPresenca);
        }

    }
}
