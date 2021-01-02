package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="PRODUCTS")
public class Product {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="PRODUCT_ID")
    private int id;
    @NotNull
    @Column(name="NAME")
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
