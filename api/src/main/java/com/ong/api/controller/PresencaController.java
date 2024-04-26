package com.ong.api.controller;


import com.ong.api.entity.Presenca;
import com.ong.api.repository.PresencaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/presenca")
public class PresencaController {

    @Autowired
    PresencaRepository repository;

    @GetMapping
    public List<Presenca> presencaList(){
        return repository.findAll();
    }
    @PostMapping
    public void savePresenca(@RequestBody Presenca presenca){
        repository.save(presenca);
    }
}
