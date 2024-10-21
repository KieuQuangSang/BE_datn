package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "product",uniqueConstraints = { @UniqueConstraint(columnNames = { "name" }) })
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column
    private String sku;

    @Column
    private String material;

    @Column
    private int visited;

    @Column
    private int price;

    @Column
    private int salePrice;

    @Column
    private Date modifiedDate;

    @Column
    private Date createdDate;

    @Column
    private int status;

}
