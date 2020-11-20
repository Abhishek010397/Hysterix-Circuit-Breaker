package com.labcerebrone.ProductWeb.client;
import com.labcerebrone.ProductWeb.api.ProductService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "product-alternate-proxy",
        /**  the url for this client is the url for Product Server 2 we built earlier */
        url = "http://localhost:8082")
public interface ProductAlternateServiceProxy extends ProductService {
}
