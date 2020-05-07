package com.catalogapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categories implements Serializable {

    private String categoryId;
    private String name;
    private Boolean hasChildren;
    private String image;

    private List<SubCategories> subCategories;
}
