package com.ong.api.controller;

import com.ong.api.entity.Acao;
import com.ong.api.repository.AcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/acao")
public class AcaoController {

    @Autowired
    AcaoRepository repository;


    @GetMapping
    public List<Acao> acaoList(){
        return repository.findAll();
    }
    @PostMapping
    public void saveAcao(@RequestBody Acao acao){
        repository.save(acao);
    }
}
