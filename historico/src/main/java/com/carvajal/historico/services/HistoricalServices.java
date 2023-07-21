package com.carvajal.historico.services;

import com.carvajal.historico.entities.Historical;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HistoricalServices {

    List<Historical> findByUserId(Long userId);
    void save(Historical historical);
}
