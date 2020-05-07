package br.com.catalogapi.dtos.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriesResponseDTO implements Serializable {
    
    @JsonProperty("id")
    private String categoryId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("hasChildren")
    private Boolean hasChildren;

    @JsonProperty("image")
    private String image;

    @JsonProperty("subCategories")
    private List<SubCategoriesResponseDTO> subCategories;
    
}
