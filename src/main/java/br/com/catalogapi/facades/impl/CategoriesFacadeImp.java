package br.com.catalogapi.facades.impl;

import br.com.catalogapi.dtos.requests.CategoriesRequestDTO;
import br.com.catalogapi.dtos.responses.CategoriesResponseDTO;
import br.com.catalogapi.dtos.responses.ChildrenResponseDTO;
import br.com.catalogapi.dtos.responses.SubCategoriesResponseDTO;
import br.com.catalogapi.entities.Categories;
import br.com.catalogapi.entities.Children;
import br.com.catalogapi.entities.SubCategories;
import br.com.catalogapi.facades.CategoriesFacade;
import br.com.catalogapi.services.CategoriesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoriesFacadeImp implements CategoriesFacade {

    @Autowired
    private CategoriesService categoriesService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoriesResponseDTO save(CategoriesRequestDTO categoriesRequestDTO) {
        return convertToDTO(categoriesService.save(convertToEntity(categoriesRequestDTO)));
    }

    @Override
    public List<CategoriesResponseDTO> getCategories() {

        List<CategoriesResponseDTO> listCategories = new ArrayList<>();

        for (Categories categories : categoriesService.getCategories()) {
            CategoriesResponseDTO categoriesResponseDTO = convertToDTO(categories);
            categoriesResponseDTO.setSubCategories(new ArrayList<>());

            listCategories.add(categoriesResponseDTO);

            for (SubCategories subCategories : categories.getSubCategories()) {
                SubCategoriesResponseDTO subCategoriesResponseDTO = convertToDTO(subCategories);
                subCategoriesResponseDTO.setChildren(new ArrayList<>());

                categoriesResponseDTO.getSubCategories().add(subCategoriesResponseDTO);

                if(subCategories.getHasChildren()){
                    for (Children children: subCategories.getChildren()) {
                        ChildrenResponseDTO childrenResponseDTO = convertToDTO(children);

                        subCategoriesResponseDTO.getChildren().add(childrenResponseDTO);
                    }
                }
            }
        }
        return listCategories;
    }

    private Categories convertToEntity(CategoriesRequestDTO categoriesRequestDTO) {
        return modelMapper.map(categoriesRequestDTO, Categories.class);
    }

    private CategoriesResponseDTO convertToDTO(Categories categories) {
        return modelMapper.map(categories, CategoriesResponseDTO.class);
    }

    private SubCategoriesResponseDTO convertToDTO(SubCategories subCategories) {
        return modelMapper.map(subCategories, SubCategoriesResponseDTO.class);
    }

    private ChildrenResponseDTO convertToDTO(Children children) {
        return modelMapper.map(children, ChildrenResponseDTO.class);
    }
}
