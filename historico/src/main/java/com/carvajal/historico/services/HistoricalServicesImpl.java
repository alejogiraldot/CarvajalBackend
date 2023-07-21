package com.carvajal.historico.services;

import com.carvajal.historico.entities.Historical;
import com.carvajal.historico.repository.HistoricalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricalServicesImpl implements HistoricalServices{

    @Autowired
    HistoricalRepository historicalRepository;

    @Override
    public List<Historical> findByUserId(Long userId) {
        return historicalRepository.findByUserId(userId);
    }

    @Override
    public void save(Historical historical) {
        historicalRepository.save(historical);
    }
}
