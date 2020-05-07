package br.com.catalogapi.facades;

import br.com.catalogapi.dtos.requests.CategoriesRequestDTO;
import br.com.catalogapi.dtos.responses.CategoriesResponseDTO;
import br.com.catalogapi.entities.Categories;
import br.com.catalogapi.services.CategoriesService;
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
