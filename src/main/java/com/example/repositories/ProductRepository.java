package com.example.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entities.Product;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete


public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findProductById(Long id);

}
