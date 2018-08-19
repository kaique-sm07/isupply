package com.hackaton.isuply.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "product")
@EntityListeners(AuditingEntityListener.class)
/** Classe que representa a entidade de um produto */
public class Product {

    @Id
    @Column(name="product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Nome do produto */
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade=CascadeType.ALL)
    private List<ProductPurveyor> prices;

    /** Tipo do produto */
    private Integer type;

    @Temporal(TemporalType.DATE)
    /** Data de validade */
    private Date expirationDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade=CascadeType.ALL)
    private List<ProductMeal> meals;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public List<ProductMeal> getMeals() {
        return meals;
    }

    public void setMeals(List<ProductMeal> meals) {
        this.meals = meals;
    }

    public List<ProductPurveyor> getPrices() {
        return prices;
    }

    public void setPrices(List<ProductPurveyor> prices) {
        this.prices = prices;
    }
}
