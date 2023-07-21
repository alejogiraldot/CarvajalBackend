package com.carvajal.desiredList.services;

import com.carvajal.desiredList.Repository.DesiredListRepository;
import com.carvajal.desiredList.entities.DesiredList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesiredListServicesImpl implements DesiredListServices{

    @Autowired
    DesiredListRepository desiredListRepository;


    @Override
    public List<DesiredList> findByUserId(Long userId) {
        return desiredListRepository.findByUserId(userId);
    }

    @Override
    public void save(DesiredList desiredLists) {
        desiredListRepository.save(desiredLists);
    }

    @Override
    public void delete(Long productId) {
        for(DesiredList dl: desiredListRepository.findByProductId(productId)) {
            desiredListRepository.delete(dl);
        }
    }

    @Override
    public List<DesiredList> findByProductId(Long productId) {
        return desiredListRepository.findByProductId(productId);
    }
}
