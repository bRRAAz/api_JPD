package com.ong.api.DTOs;

public class UsuarioDTO {
    private Long id;
    private String name;
    private String socialName;
    private String pronome;
    private String dateBirth;
    private String entryDate;
    private String emergencyTel;
    private String email;
    private String tel;
    private int numberOfAction;
    private String setor;
    private String team;
    private boolean setorMember;
    private boolean coordinator;
    private int late;
    private int miss;
    private String gender;
    private String coordinatorSetor;

    public String getCoordinatorSetor() {
        return coordinatorSetor;
    }

    public void setCoordinatorSetor(String coordinatorSetor) {
        this.coordinatorSetor = coordinatorSetor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEmergencyTel() {
        return emergencyTel;
    }

    public void setEmergencyTel(String emergencyTel) {
        this.emergencyTel = emergencyTel;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public boolean isSetorMember() {
        return setorMember;
    }

    public boolean isCoordinator() {
        return coordinator;
    }

    public long getId() {
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

    public boolean getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(boolean coordinator) {
        this.coordinator = coordinator;
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
}
