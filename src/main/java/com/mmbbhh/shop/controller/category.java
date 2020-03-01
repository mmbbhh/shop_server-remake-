package com.mmbbhh.shop.controller;

import com.mmbbhh.shop.model.Category;
import com.mmbbhh.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class category {
    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public List<Category> getCategory() {
        return categoryService.getCategory();
    }
}
