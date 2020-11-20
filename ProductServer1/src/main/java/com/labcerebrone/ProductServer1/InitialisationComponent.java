package com.labcerebrone.ProductServer1;


import com.labcerebrone.ProductServer1.models.Product;
import com.labcerebrone.ProductServer1.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitialisationComponent {

    @Autowired
    private ProductRepository productRepository;
    /** Methods*/
    @PostConstruct
    public void init() {

        productRepository.deleteAll();//to delete the existing data on the DB & re-initialise it

        Product product = new Product();
        product.setName("WD SDD");
        product.setCode("WD-Global 500MB");
        product.setTitle("SATA HDD");
        product.setDescription("SATA HDD Dual Boot Powered");
        product.setLocation("Kansas Missouri");
        product.setPrice(8000.00); //Not A String Type
        productRepository.save(product);

        product = new Product();
        product.setName("Office Home & Student 2016");
        product.setCode("SKU-79G-04679");
        product.setTitle("Microsoft Windows");
        product.setDescription("Office2016 Student Edition");
        product.setLocation("Kansas Missouri");
        product.setPrice(16000.00);// Not a String Type
        productRepository.save(product);

    }
}
