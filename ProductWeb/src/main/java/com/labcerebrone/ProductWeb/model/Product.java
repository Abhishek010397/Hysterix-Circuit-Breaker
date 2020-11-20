package com.labcerebrone.ProductWeb.model;

import org.springframework.data.annotation.Id;
import lombok.Data;

@Data
public class Product {

    @Id
    private String productId;
    private String name;
    private String code;;
    private String title;
    private String description;
    private String Location;
    private Double price;

    public Product(){

    }
}
