package com.carvajal.historico.repository;

import com.carvajal.historico.entities.Historical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoricalRepository extends JpaRepository<Historical, Long> {
    List<Historical> findByUserId(Long userId);
}
