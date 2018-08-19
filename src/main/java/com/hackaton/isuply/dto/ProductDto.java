package com.hackaton.isuply.dto;

public class ProductDto {

    /** Nome do produto */
    private String name;

    /** Tipo do produto */
    private Integer type;

    /** Data de validade */
    private String expirationDate;

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

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
