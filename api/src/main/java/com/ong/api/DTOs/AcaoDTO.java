package com.ong.api.DTOs;

import jakarta.persistence.JoinColumn;

import java.time.LocalDateTime;
import java.util.List;

public class AcaoDTO {
    LocalDateTime date;
    int start;
    int finish;
    String address;
    int numberOfVolunteers;
    String description;
    List<UsuarioDTO> userDTO;

    public AcaoDTO(LocalDateTime date, int start, int finish, String address, int numberOfVolunteers, String description, List<UsuarioDTO> userDTO) {
        this.date = date;
        this.start = start;
        this.finish = finish;
        this.address = address;
        this.numberOfVolunteers = numberOfVolunteers;
        this.description = description;
        this.userDTO = userDTO;
    }

    public AcaoDTO() {
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfVolunteers() {
        return numberOfVolunteers;
    }

    public void setNumberOfVolunteers(int numberOfVolunteers) {
        this.numberOfVolunteers = numberOfVolunteers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<UsuarioDTO> getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(List<UsuarioDTO> userDTO) {
        this.userDTO = userDTO;
    }
}
