package br.com.catalogapi.facades;

import br.com.catalogapi.dtos.requests.CategoriesRequestDTO;
import br.com.catalogapi.dtos.responses.CategoriesResponseDTO;

public interface CategoriesFacade {

    CategoriesResponseDTO save(CategoriesRequestDTO categoriesRequestDTO);
}
