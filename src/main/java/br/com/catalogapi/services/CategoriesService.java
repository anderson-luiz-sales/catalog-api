package br.com.catalogapi.services;

import br.com.catalogapi.entities.Categories;

import java.util.List;

public interface CategoriesService {

    Categories save(Categories categories);

    List<Categories> getCategories();
}
