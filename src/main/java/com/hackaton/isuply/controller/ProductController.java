package com.hackaton.isuply.controller;

import com.hackaton.isuply.dto.ProductDto;
import com.hackaton.isuply.model.Product;
import com.hackaton.isuply.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/purveyor")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    /** Lista todos os produtos cadastrados */
    public List<Product> getAllRestaurants() {
        return productService.getAll();
    }


    @GetMapping("/getById/{id}")
    /** Busca um produto pelo id */
    public Product getById(@PathVariable(value = "id") Long id) {
        return productService.getById(id);
    }

    @PostMapping("/create/{restaurant}")
    /** Cria um produto a partir dos dados enviaods pela api */
    public Product createRestaurant(@Valid @RequestBody ProductDto productDto) throws ParseException {

        Product product = new Product();
        product.setExpirationDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).
                parse(productDto.getExpirationDate()));
        product.setName(productDto.getName());
        product.setType(productDto.getType());
        return productService.insert(product);
    }


    @PutMapping("/update/{id}")
    /** Atualiza as inforacoes de um determinado produto */
    public Product updateRestaurant(@PathVariable(value = "id") Long id,
                                    @Valid @RequestBody ProductDto productDto) throws ParseException {

        Product product = productService.getById(id);
        product.setExpirationDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).
                parse(productDto.getExpirationDate()));
        product.setName(productDto.getName());
        product.setType(productDto.getType());
        return productService.insert(product);
    }
}
