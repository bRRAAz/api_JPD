package com.ong.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @Column(unique = true)
    private String email;
    private String tel;
    private String emergencyTel;
    private String entryDate;
    private String team;
    private int numberOfAction;
    private boolean setorMember;
    private String setor;
    private boolean coordinator;
    private int late;
    private int miss;
    private String gender;
    private String coordinatorSetor;
    private boolean delete = false;

    public boolean getDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public String getCoordinatorSetor() {
        return coordinatorSetor;
    }

    public void setCoordinatorSetor(String coordinatorSetor) {
        this.coordinatorSetor = coordinatorSetor;
    }

    public boolean isSetorMember() {
        return setorMember;
    }

    public boolean isCoordinator() {
        return coordinator;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Usuario(Long id, String name, String socialName, String password, String pronome, String dateBirth, String email, String tel, String emergencyTel, String entryDate, String team, int numberOfAction, boolean setorMember, String setor, boolean coordinator, int late, int miss, String gender, String coordinatorSetor) {
        this.id = id;
        this.name = name;
        this.socialName = socialName;
        this.password = password;
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
        this.late = late;
        this.miss = miss;
        this.gender = gender;
        this.coordinatorSetor = coordinatorSetor;
    }

    public Usuario(){

    }

    public Usuario(String email, String password){
        this.email = email;
        this.password = password;
    }

    public Usuario(String name, String socialName, String password, String pronome, String dateBirth, String email, String tel, String emergencyTel, String entryDate, String team, int numberOfAction, boolean setorMember, String setor, boolean coordinator, int late, int miss, String gender, String coordinatorSetor) {
        this.name = name;
        this.socialName = socialName;
        this.password = password;
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
        this.late = late;
        this.miss = miss;
        this.gender = gender;
        this.coordinatorSetor = coordinatorSetor;
    }

    public int getLate() {
        return late;
    }

    public void setLate(int late) {
        this.late = late;
    }

    public int getMiss() {
        return miss;
    }

    public void setMiss(int miss) {
        this.miss = miss;
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

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getNumberOfAction() {
        return numberOfAction;
    }

    public void setNumberOfAction(int numberOfAction) {
        this.numberOfAction = numberOfAction;
    }

    public boolean getSetorMember() {
        return setorMember;
    }

    public void setSetorMember(boolean setorMember) {
        this.setorMember = setorMember;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getCoordinator() {
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