package com.example.backend.controller;

import com.example.backend.entity.ProductEntity;
import com.example.backend.service.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin/product")
public class ProductController {
    private final ProductService productService;
    @GetMapping("/create")
    public ProductEntity createProduct(@RequestBody ProductEntity product) {

        return productService.createProduct(product);
    }
}
