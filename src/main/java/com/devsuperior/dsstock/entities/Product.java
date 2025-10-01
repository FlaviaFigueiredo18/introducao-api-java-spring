package com.devsuperior.dsstock.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "tb_product")
public class Product {

    @Id
    private UUID id;
    private String name;
    private Double price;
    private Integer quantity;

    // Construtor vazio (boa prática para JPA)
    public Product() {
    }

    // GETTERS - Adicione este bloco de código
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    // Setters também são uma boa prática se você pretende alterar os objetos
    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}