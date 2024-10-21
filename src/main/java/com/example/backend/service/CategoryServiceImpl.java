package com.example.backend.service;

import com.example.backend.entity.CategoryEntity;
import com.example.backend.model.Category;
import com.example.backend.repository.CategoryRepository;
import com.example.backend.service.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
private final CategoryRepository categoryRepository;


    @Override
    public List<CategoryEntity> findAllSelectBox() {
        return categoryRepository.findByStatus(1);
    }
}
