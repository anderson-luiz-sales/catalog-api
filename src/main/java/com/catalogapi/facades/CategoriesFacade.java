package com.catalogapi.facades;

import com.catalogapi.dtos.requests.CategoriesRequestDTO;
import com.catalogapi.dtos.responses.CategoriesResponseDTO;

public interface CategoriesFacade {

    CategoriesResponseDTO save(CategoriesRequestDTO categoriesRequestDTO);
}
