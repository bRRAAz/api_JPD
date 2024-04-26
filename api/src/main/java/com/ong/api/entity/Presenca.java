package com.ong.api.entity;

import jakarta.persistence.*;

@Entity
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "action_id")
    Acao action;
    @ManyToOne
    @JoinColumn(name = "user_id")
    Usuario user;
    String presence;

    public Presenca(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Acao getAction() {
        return action;
    }

    public void setAction(Acao action) {
        this.action = action;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }
}
