package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

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

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @Column(name = "ITEM_ID", nullable = false)
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private List<Item> items;

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
