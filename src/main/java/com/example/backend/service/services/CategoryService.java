package com.example.backend.service.services;

import com.example.backend.entity.CategoryEntity;
import com.example.backend.model.Category;

import java.util.List;

public interface CategoryService {
    List<CategoryEntity> findAllSelectBox();
}
