package com.hackaton.isuply.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Entity
@Table(name = "product_purveyor")
@EntityListeners(AuditingEntityListener.class)
/** Entidade de ligacao entre produto e produtor */
public class ProductPurveyor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /** Referencia para o Produtor */
    private Purveyor purveyor;

    /** Referencia para o Produto */
    private Product product;

    @NotBlank
    /** Numero de itens */
    private BigDecimal itens;

    /** Tipo de medida (0 = ml, 1 = gr, 2 = unidade) */
    private Integer measure;

    public Purveyor getPurveyor() {
        return purveyor;
    }

    public void setPurveyor(Purveyor purveyor) {
        this.purveyor = purveyor;
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
