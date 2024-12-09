package com.dragonball.cartProject.service;

import com.dragonball.cartProject.model.Product;
import com.dragonball.cartProject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}
