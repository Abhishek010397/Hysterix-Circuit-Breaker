package com.labcerebrone.ProductWeb.component;


import com.labcerebrone.ProductWeb.client.ProductAlternateServiceProxy;
import com.labcerebrone.ProductWeb.client.ProductServiceProxy;
import com.labcerebrone.ProductWeb.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
/**
@EnableFeignClients(basePackageClasses = ProductAlternateServiceProxy.class)
*/

@ComponentScan(basePackageClasses = ProductAlternateServiceProxy.class)
@Component
public class ProductWebComponent implements ProductServiceProxy {

    Logger logger = LoggerFactory.getLogger(ProductWebComponent.class);

    @Autowired
    ProductAlternateServiceProxy productAlternateServiceProxy;

    /**
    public ProductWebComponent(ProductAlternateServiceProxy productAlternateServiceProxy) {
        this.productAlternateServiceProxy = productAlternateServiceProxy;
    }
*/
    @Override
    public List<Product> getAllProducts() {
        logger.info("Delegating to the Secondary Server...");
        return productAlternateServiceProxy.getAllProducts();
    }

    @Override
    public Product getProduct(String productId) {
        logger.info("Delegating to the Secondary Server...");
        return productAlternateServiceProxy.getProduct(productId);

    }


}
