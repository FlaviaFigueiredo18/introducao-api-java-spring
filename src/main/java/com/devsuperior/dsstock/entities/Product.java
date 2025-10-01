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

    // getters, setters
}