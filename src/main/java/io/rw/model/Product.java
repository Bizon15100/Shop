package io.rw.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "description")
    private String desc;
    private BigDecimal price;

    public Product(String name, String desc, BigDecimal price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public Product() {
    }
}
