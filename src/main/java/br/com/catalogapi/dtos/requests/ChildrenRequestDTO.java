package br.com.catalogapi.dtos.requests;

import lombok.Data;

@Data
public class ChildrenRequestDTO {

    private String childrenId;
    private String name;
    private Boolean hasChildren;
    private String image;
}
