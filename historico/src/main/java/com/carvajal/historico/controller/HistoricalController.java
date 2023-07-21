package com.carvajal.historico.controller;

import com.carvajal.historico.entities.Historical;
import com.carvajal.historico.services.HistoricalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Historico/")
@CrossOrigin("*")
public class HistoricalController {
    @Autowired
    private HistoricalServices historicalServices;

    @PostMapping("save")
    public void save(@RequestBody Historical historical) {
        historicalServices.save(historical);
    }

    @GetMapping("search/{userId}")
    public List<Historical> search(@PathVariable Long userId){
        return historicalServices.findByUserId(userId);
    }
}
