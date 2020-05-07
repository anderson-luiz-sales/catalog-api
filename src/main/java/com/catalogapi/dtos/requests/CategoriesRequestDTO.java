package com.catalogapi.dtos.requests;

import lombok.Data;

import java.util.List;

@Data
public class CategoriesRequestDTO {

    private String categoryId;
    private String name;
    private Boolean hasChildren;
    private String image;

    private List<SubCategoriesRequestDTO> subCategories;
}
