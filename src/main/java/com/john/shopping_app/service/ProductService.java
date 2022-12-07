package com.john.shopping_app.service;

import com.john.shopping_app.model.Product;
import com.john.shopping_app.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProducts(String title){
        if (title != null) productRepository.findByTitle(title);
        return productRepository.findAll();
    }

    public void saveProduct(Product product){
        log.info("Добавлен новый продукт {}", product);
        productRepository.save(product);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }


    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }
}
