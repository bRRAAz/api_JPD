package com.ong.api.entity;

import jakarta.persistence.*;

@Entity
public class Setor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario leader;

    public Setor(){

    }
    public Setor(String descricao){
        this.descricao = descricao;
    }
    public Setor(String descricao, Usuario leader){
        this.descricao = descricao;
        this.leader = leader;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public Usuario getLeader(){
        return leader;
    }
    public void setLeader(Usuario leader){
        this.leader = leader;
    }
}
