package com.labcerebrone.ProductWeb;

import com.labcerebrone.ProductWeb.client.ProductServiceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients(basePackageClasses = ProductServiceProxy.class)
@EnableDiscoveryClient
public class ProductWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductWebApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}