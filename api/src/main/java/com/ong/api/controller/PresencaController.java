package com.ong.api.controller;



import com.ong.api.entity.Presenca;
import com.ong.api.entity.Usuario;
import com.ong.api.repository.PresencaRepository;
import com.ong.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        repository.save(presenca);
    }
}
