package com.labcerebrone.ProductWeb.client;


import com.labcerebrone.ProductWeb.api.ProductService;
import com.labcerebrone.ProductWeb.component.ProductWebComponent;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name="product-proxy",
        url = "http://localhost:8081",
        fallback = ProductWebComponent.class)
public interface ProductServiceProxy extends ProductService {
}
