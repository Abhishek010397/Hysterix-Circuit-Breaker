package com.labcerebrone.ProductServer2.repositories;


import com.labcerebrone.ProductServer2.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel= "productsdata",path = "productdata")
public interface ProductRepository extends MongoRepository<Product, String> {
}
