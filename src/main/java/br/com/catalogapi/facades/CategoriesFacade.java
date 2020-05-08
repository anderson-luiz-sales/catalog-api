package br.com.catalogapi.facades;

import br.com.catalogapi.dtos.requests.CategoriesRequestDTO;
import br.com.catalogapi.dtos.responses.CategoriesResponseDTO;

import java.util.List;

public interface CategoriesFacade {

    CategoriesResponseDTO save(CategoriesRequestDTO categoriesRequestDTO);

    List<CategoriesResponseDTO> getCategories();
}
