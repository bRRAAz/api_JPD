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
}
