package com.carvajal.products.Services;

import com.carvajal.products.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductServices {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    void save(Product product);

}
