package com.example.repositories;


import org.springframework.data.repository.CrudRepository;
import com.example.entities.Product;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ProductRepository extends CrudRepository<Product, Long> {

}
