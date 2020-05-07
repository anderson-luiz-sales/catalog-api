package br.com.catalogapi.dtos.requests;

import lombok.Data;

import java.util.List;

@Data
public class SubCategoriesRequestDTO {

    private String subCategoryId;
    private String name;
    private Boolean hasChildren;
    private String image;

    private List<ChildrenRequestDTO> children;
}
