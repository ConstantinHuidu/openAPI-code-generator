package com.code_generator.demo_code_generaror.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String sku;

    private String name;

    private int quantity;
}
