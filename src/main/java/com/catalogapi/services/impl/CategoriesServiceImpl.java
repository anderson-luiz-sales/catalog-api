package com.catalogapi.services.impl;

import com.catalogapi.entities.Categories;
import com.catalogapi.repositories.CategoriesRepository;
import com.catalogapi.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public Categories save(Categories categories) {

        return categoriesRepository.save(categories);
    }
}
