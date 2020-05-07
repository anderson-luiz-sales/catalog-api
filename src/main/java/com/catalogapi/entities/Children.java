package com.catalogapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Children implements Serializable {

    private String childrenId;
    private String name;
    private Boolean hasChildren;
    private String image;
}
