package com.carvajal.products.cotroller;

import com.carvajal.products.Services.ProductServices;
import com.carvajal.products.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product/")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @GetMapping("findAll")
    public List<Product> findAll(){
        return productServices.findAll();
    }

    @GetMapping("findById/{id}")
    public Optional<Product> findById(@PathVariable Long id){
        return productServices.findById(id);
    }

    @PostMapping("save")
    public void save(@RequestBody Product product) {
        productServices.save(product);
    }

}
