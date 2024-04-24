package com.ong.api.entity;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String socialName;
    private String password;
    private String pronome;
    private String dateBirth;
    private String email;
    private String tel;
    private String emergencyTel;
    private String entryDate;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Equipe team;
    private int numberOfAction;
    private boolean setorMember;
    @ManyToOne
    @JoinColumn(name = "setor_id")
    private Setor setor;
    private boolean coordinator;

    public Usuario(Long id, String name, String socialName, String pronome, String dateBirth, String email, String tel, String emergencyTel, String entryDate, Equipe team, int numberOfAction, boolean setorMember, Setor setor, boolean coordinator) {
        this.id = id;
        this.name = name;
        this.socialName = socialName;
        this.pronome = pronome;
        this.dateBirth = dateBirth;
        this.email = email;
        this.tel = tel;
        this.emergencyTel = emergencyTel;
        this.entryDate = entryDate;
        this.team = team;
        this.numberOfAction = numberOfAction;
        this.setorMember = setorMember;
        this.setor = setor;
        this.coordinator = coordinator;
    }
    public Usuario(){

    }

    public Usuario(String email, String password){
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialName() {
        return socialName;
    }

    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }

    public String getPronome() {
        return pronome;
    }

    public void setPronome(String pronome) {
        this.pronome = pronome;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmergencyTel() {
        return emergencyTel;
    }

    public void setEmergencyTel(String emergencyTel) {
        this.emergencyTel = emergencyTel;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public Equipe getTeam() {
        return team;
    }

    public void setTeam(Equipe team) {
        this.team = team;
    }

    public int getNumberOfAction() {
        return numberOfAction;
    }

    public void setNumberOfAction(int numberOfAction) {
        this.numberOfAction = numberOfAction;
    }

    public boolean isSetorMember() {
        return setorMember;
    }

    public void setSetorMember(boolean setorMember) {
        this.setorMember = setorMember;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public boolean isCoordinator() {
        return coordinator;
    }

    public void setCoordinator(boolean coordinator) {
        this.coordinator = coordinator;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
