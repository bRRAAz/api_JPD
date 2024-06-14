package com.ong.api.repository;

import com.ong.api.entity.Presenca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PresencaRepository extends JpaRepository<Presenca, Long> {

    @Query("SELECT p FROM Presenca p WHERE p.user.id IN :userIds")
    List<Presenca> findAllByUserId(@Param("userIds") List<Long> userIds);

    @Query("SELECT p FROM Presenca p WHERE p.user.id = :userId AND p.action.id = :actionId")
    Presenca findByActionIdAndUserId(@Param("actionId") Long actionId, @Param("userId") Long userId);

}
