package com.ong.api.repository;

import com.ong.api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.yaml.snakeyaml.events.Event;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);

    List<Usuario> findAllById(Iterable<Long> listIds);

    @Query("SELECT u FROM Usuario u WHERE u.name LIKE %:name%")
    List<Usuario> findByNameContaining(@Param("name") String name);

}
