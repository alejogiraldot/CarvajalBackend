package com.carvajal.desiredList.controller;

import com.carvajal.desiredList.entities.DesiredList;
import com.carvajal.desiredList.services.DesiredListServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("desiredList/")
@CrossOrigin("*")
public class DesiredListController {

    @Autowired
    private DesiredListServices desiredListServices;

    @PostMapping("save")
    public void save(@RequestBody DesiredList desiredList) {
        desiredListServices.save(desiredList);
    }

    @DeleteMapping("delete/{productId}")
    public void delete(@PathVariable Long productId){
        desiredListServices.delete(productId);
    }

    @GetMapping("search/{userId}")
    public List<DesiredList> search(@PathVariable Long userId){
       return desiredListServices.findByUserId(userId);
    }

    @GetMapping("findById/{productId}")
    public List<DesiredList> findByProductId(@PathVariable Long productId){
        return desiredListServices.findByProductId(productId);
    }

}
