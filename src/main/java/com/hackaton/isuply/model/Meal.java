package com.hackaton.isuply.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "meal")
@EntityListeners(AuditingEntityListener.class)
/** Classe que representa a entidade de um prato */
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "meal", cascade=CascadeType.ALL)
    /** Lista de produtos que compoem esse prato */
    private List<ProductMeal> products;

    /** Nome */
    private String name;

    /** ULR da imagem do prato */
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade=CascadeType.ALL)
    public List<ProductMeal> getProducts() {
        return products;
    }

    public void setProducts(List<ProductMeal> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
