package com.ong.api.controller;

import com.ong.api.entity.Setor;
import com.ong.api.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/setor")
public class setorController {
    @Autowired
    SetorRepository repository;


    @GetMapping
    public List<Setor> setorList(){
        return repository.findAll();
    }
    @PostMapping
    public void setorCreate(@RequestBody Setor setor){
        repository.save(setor);
    }
}
