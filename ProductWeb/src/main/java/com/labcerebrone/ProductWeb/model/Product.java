package com.labcerebrone.ProductWeb.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import org.springframework.data.annotation.Id;
import lombok.Data;

@Data
//For Serialisation Use JsonAutoDetect Annotation
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
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
