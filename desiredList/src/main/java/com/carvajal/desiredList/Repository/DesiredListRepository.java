package com.carvajal.desiredList.Repository;

import com.carvajal.desiredList.entities.DesiredList;
import com.carvajal.desiredList.services.DesiredListServicesImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DesiredListRepository extends JpaRepository<DesiredList,Long> {

    List<DesiredList> findByUserId(Long userId);
    List<DesiredList> findByProductId(Long productId);
}
