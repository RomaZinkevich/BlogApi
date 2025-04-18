package com.zirom.blog.services;

import com.zirom.blog.domain.dtos.CreateCategoryRequest;
import com.zirom.blog.domain.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> listCategories();
    Category createCategory(Category category);
}
