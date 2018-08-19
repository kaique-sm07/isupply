package com.hackaton.isuply.dao;

import com.hackaton.isuply.exception.ResourceNotFoundException;
import com.hackaton.isuply.model.Product;
import com.hackaton.isuply.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductDao {

    @Autowired
    private ProductRepository productRepository;

    /** Busca todos os produtos */
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    /** Busca produto pelo id */
    public Product getById(Long id) {
        return productRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
    }

    /** Insere um produto no banco de dados */
    public Product insert(Product product) {
        return null;
    }
}
