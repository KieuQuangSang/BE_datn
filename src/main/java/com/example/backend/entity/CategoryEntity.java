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
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(nullable = false)
    private String title;

    @Column
    private String description;

    @Column
    private Date createdDate;

    @Column
    private Date modifiedDate;

    @Column
    private String urlImage;

    @Column
    private int type;//xác định là 0: sản phẩm, 1: chính sách, 2: bài viết, 3: tuyển dụng

    @Column(nullable = false)
    private int status;//xác định là 0: ẩn , 1: hiện
}
