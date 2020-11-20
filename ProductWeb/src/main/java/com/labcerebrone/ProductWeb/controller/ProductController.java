package com.labcerebrone.ProductWeb.controller;


import com.labcerebrone.ProductWeb.api.ProductService;
import com.labcerebrone.ProductWeb.client.ProductServiceProxy;
import com.labcerebrone.ProductWeb.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** This class should implement the ProductService.
 * This is because the method we that are exposed are defined in the ProductService.*/
@RestController
@RefreshScope
/**
@CrossOrigin
@EnableFeignClients(basePackageClasses = ProductServiceProxy.class)

 */
@ComponentScan(basePackageClasses = ProductServiceProxy.class)
public class ProductController implements ProductService {


    @Autowired
    ProductServiceProxy productServiceProxy;


    public ProductController(ProductServiceProxy productServiceProxy) {
        this.productServiceProxy = productServiceProxy;
    }




    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return productServiceProxy.getAllProducts();
    }


    @RequestMapping("/productsweb/{productId}")
    public Product getProduct(@PathVariable("productId") String productId) {
        return productServiceProxy.getProduct(productId);
    }
}
