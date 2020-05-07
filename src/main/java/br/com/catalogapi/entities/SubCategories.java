package br.com.catalogapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubCategories implements Serializable {

    private String subCategoryId;
    private String name;
    private Boolean hasChildren;
    private String image;
    
    private List<Children> children;
}
