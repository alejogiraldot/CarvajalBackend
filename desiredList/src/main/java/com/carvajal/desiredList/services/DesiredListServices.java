package com.carvajal.desiredList.services;

import com.carvajal.desiredList.entities.DesiredList;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DesiredListServices {

    List<DesiredList> findByUserId(Long userId);
    void save(DesiredList desiredLists);
    void delete(Long productId);
    List<DesiredList> findByProductId(Long productId);
}
