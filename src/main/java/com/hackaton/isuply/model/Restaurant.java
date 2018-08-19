package com.hackaton.isuply.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "restaurant")
@EntityListeners(AuditingEntityListener.class)
/** Classe que representa a entidade de um restaurante */
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    /** Nome do restaurante */
    private String name;

    @NotBlank
    /** Latitude */
    private BigDecimal lat;

    @NotBlank
    /** Longitude */
    private BigDecimal lon;

    /** Telefone */
    private String phone;

    /** Site */
    private String site;

    @NotBlank
    /** email */
    private String email;

    /** Contato mais acessivel (email, telefone, etc) */
    private String contact;

    /** Lista com os fornecedores favoritos */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "purveyor", cascade=CascadeType.ALL)
    private List<Purveyor> favorites;

    /**Lista dos pratos desse restaurante*/
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "meal", cascade=CascadeType.ALL)
    private List<Meal> menu;

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

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLon() {
        return lon;
    }

    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Purveyor> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Purveyor> favorites) {
        this.favorites = favorites;
    }

    public List<Meal> getMenu() {
        return menu;
    }

    public void setMenu(List<Meal> menu) {
        this.menu = menu;
    }
}
