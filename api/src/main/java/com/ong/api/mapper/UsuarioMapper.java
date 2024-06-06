package com.ong.api.mapper;

import com.ong.api.DTOs.UsuarioDTO;
import com.ong.api.entity.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO toUsuarioDTO(Usuario user){
        UsuarioDTO userDTO = new UsuarioDTO();
        userDTO.setId(user.getId());
        userDTO.setCoordinator(user.getCoordinator());
        userDTO.setLate(user.getLate());
        userDTO.setEmail(user.getEmail());
        userDTO.setMiss(user.getMiss());
        userDTO.setName(user.getName());
        userDTO.setDateBirth(user.getDateBirth());
        userDTO.setNumberOfAction(user.getNumberOfAction());
        userDTO.setPronome(user.getPronome());
        userDTO.setSetorMember(user.getSetorMember());
        userDTO.setSocialName(user.getSocialName());
        userDTO.setTel(user.getTel());
        userDTO.setSetor(user.getSetor());
        userDTO.setTeam(user.getTeam());
        userDTO.setEntryDate(user.getEntryDate());
        userDTO.setEmergencyTel(user.getEmergencyTel());
        userDTO.setGender(user.getGender());
        userDTO.setCoordinatorSetor(user.getCoordinatorSetor());
        return userDTO;
    }
    public static Usuario toUsuario(UsuarioDTO userDTO){
        Usuario user = new Usuario();
        user.setId(userDTO.getId());
        user.setCoordinator(userDTO.getCoordinator());
        user.setLate(userDTO.getLate());
        user.setEmail(userDTO.getEmail());
        user.setMiss(userDTO.getMiss());
        user.setName(userDTO.getName());
        user.setDateBirth(userDTO.getDateBirth());
        user.setNumberOfAction(userDTO.getNumberOfAction());
        user.setPronome(userDTO.getPronome());
        user.setSetorMember(userDTO.getSetorMember());
        user.setSocialName(userDTO.getSocialName());
        user.setTel(userDTO.getTel());
        user.setSetor(userDTO.getSetor());
        user.setTeam(userDTO.getTeam());
        user.setEntryDate(userDTO.getEntryDate());
        user.setEmergencyTel(userDTO.getEmergencyTel());
        user.setGender(userDTO.getGender());
        user.setCoordinatorSetor(user.getCoordinatorSetor());
        return user;
    }
}
