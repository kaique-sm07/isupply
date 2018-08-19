package com.hackaton.isuply.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Entity
@Table(name = "product_meal")
@EntityListeners(AuditingEntityListener.class)
public class ProductMeal {

    @ManyToOne
    @JoinColumn(name="MealFK")
    private Meal meal;

    @ManyToOne
    @JoinColumn(name="ProductFK")
    private Product product;

    @NotBlank
    /** Numero de itens  */
    private BigDecimal itens;

    /** Tipo de medida (0 = ml, 1 = gr, 2 = unidade) */
    private Integer measure;

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getItens() {
        return itens;
    }

    public void setItens(BigDecimal itens) {
        this.itens = itens;
    }

    public Integer getMeasure() {
        return measure;
    }

    public void setMeasure(Integer measure) {
        this.measure = measure;
    }
}
