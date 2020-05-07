package com.catalogapi.facades;

import com.catalogapi.dtos.requests.CategoriesRequestDTO;
import com.catalogapi.dtos.responses.CategoriesResponseDTO;
import com.catalogapi.entities.Categories;
import com.catalogapi.services.CategoriesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoriesFacadeImp implements CategoriesFacade{

    @Autowired
    private CategoriesService categoriesService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoriesResponseDTO save(CategoriesRequestDTO categoriesRequestDTO) {
        return convertToDTO(categoriesService.save(convertToEntity(categoriesRequestDTO)));
    }

    private Categories convertToEntity(CategoriesRequestDTO categoriesRequestDTO) {
        return modelMapper.map(categoriesRequestDTO, Categories.class);
    }

    private CategoriesResponseDTO convertToDTO(Categories categories) {
        return modelMapper.map(categories, CategoriesResponseDTO.class);
    }
}
