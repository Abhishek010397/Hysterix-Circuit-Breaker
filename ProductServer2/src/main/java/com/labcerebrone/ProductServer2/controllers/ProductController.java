package com.labcerebrone.ProductServer2.controllers;

import com.labcerebrone.ProductServer2.models.Product;
import com.labcerebrone.ProductServer2.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    /** two methods*/
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /** the return block is optional in case it doesn't find the productID*/
    @GetMapping("/products/{productId}")
    public Optional<Product> getProduct (@PathVariable("productID") String productId) {
        return productRepository.findById(productId);
    }
}
