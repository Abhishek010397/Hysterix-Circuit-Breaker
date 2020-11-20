package com.labcerebrone.ProductServer1.repositories;

import com.labcerebrone.ProductServer1.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel= "productsdata",path = "productdata")
public interface ProductRepository extends MongoRepository<Product, String> {

}
