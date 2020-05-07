package com.catalogapi.dtos.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubCategoriesResponseDTO implements Serializable {

    @JsonProperty("id")
    private String subCategoryId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("hasChildren")
    private Boolean hasChildren;

    @JsonProperty("image")
    private String image;

    @JsonProperty("children")
    private List<ChildrenResponseDTO> children;
}
