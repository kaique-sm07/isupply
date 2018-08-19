package com.hackaton.isuply.service;

import com.hackaton.isuply.dao.ProductDao;
import com.hackaton.isuply.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {

    @Autowired
    private ProductDao productDao;

    /** Busca todos os produtos */
    public List<Product> getAll() {
        return productDao.getAll();
    }

    /** Busca produto pelo id */
    public Product getById(Long id) {
        return productDao.getById(id);
    }

    /** Insere novo produto */
    public Product insert(Product product) {
        return productDao.insert(product);
    }
}
