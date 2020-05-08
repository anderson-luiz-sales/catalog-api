package br.com.catalogapi.services.impl;

import br.com.catalogapi.entities.Categories;
import br.com.catalogapi.repositories.CategoriesRepository;
import br.com.catalogapi.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public Categories save(Categories categories) {

        return categoriesRepository.save(categories);
    }

    @Override
    public List<Categories> getCategories() {
        return categoriesRepository.findAll();
    }
}
