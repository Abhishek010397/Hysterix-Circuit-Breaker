package com.labcerebrone.ProductWeb.api;

import com.labcerebrone.ProductWeb.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface ProductService {

    @RequestMapping("/products")
    public List<Product> getAllProducts();

    @RequestMapping("/products/{productId}")
    public Product getProduct(@PathVariable(value = "productId") String productId);
}
