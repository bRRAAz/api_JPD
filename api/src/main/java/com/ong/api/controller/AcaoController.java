package com.ong.api.controller;

import com.ong.api.DTOs.AcaoDTO;
import com.ong.api.entity.Acao;
import com.ong.api.mapper.AcaoMapper;
import com.ong.api.repository.AcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "api/acao")
public class AcaoController {

    @Autowired
    AcaoRepository repository;

    @Autowired
    AcaoMapper mapper;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<Acao> acaoList(){
        return repository.findAll();
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(value = "/id")
    public AcaoDTO acaoUnique(@RequestHeader Long Id){
        Acao newAcao = repository.findById(Id).orElseThrow(() -> new NoSuchElementException("Ação não encontrada!"));
        AcaoDTO responseAcaoDTO = mapper.acaoToAcaoDTO(newAcao);
        return responseAcaoDTO;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveAcao(@RequestBody Acao acao){
        repository.save(acao);
    }
}
