package com.example.backend.controller;

import com.example.backend.service.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin/category")
public class CategoryController {
private final CategoryService categoryService;
@GetMapping("")
    public ResponseEntity<?> findAllSelectBox(){
    return ResponseEntity.ok(categoryService.findAllSelectBox());
}
}
