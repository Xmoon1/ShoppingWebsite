package com.john.shopping_app.repository;

import com.john.shopping_app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
