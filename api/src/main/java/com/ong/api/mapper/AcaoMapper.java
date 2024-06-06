package com.ong.api.mapper;

import com.ong.api.DTOs.AcaoDTO;
import com.ong.api.DTOs.UsuarioDTO;
import com.ong.api.entity.Acao;
import com.ong.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class AcaoMapper {
    @Autowired
    UsuarioRepository userRepository;

    public AcaoDTO acaoToAcaoDTO(Acao data){

        Iterable<Long> ids = data.getUserId().stream().map(Integer::longValue).toList();
        List<UsuarioDTO> userDTO = userRepository.findAllById(ids).stream().map(UsuarioMapper::toUsuarioDTO).toList();
        AcaoDTO acaoDTO = new AcaoDTO();
        acaoDTO.setAddress(data.getAddress());
        acaoDTO.setDate(data.getDate());
        acaoDTO.setDescription(data.getDescription());
        acaoDTO.setFinish(data.getFinish());
        acaoDTO.setStart(data.getStart());
        acaoDTO.setNumberOfVolunteers(data.getNumberOfVolunteers());
        acaoDTO.setUserDTO(userDTO);
        return acaoDTO;
    }
}
