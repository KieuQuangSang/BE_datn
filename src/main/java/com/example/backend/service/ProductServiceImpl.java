package com.example.backend.service;

import com.example.backend.entity.ProductEntity;
import com.example.backend.repository.ProductRepository;
import com.example.backend.service.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        return productRepository.save(product);
    }
}
