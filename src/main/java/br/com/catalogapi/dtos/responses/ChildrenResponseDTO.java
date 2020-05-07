package br.com.catalogapi.dtos.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChildrenResponseDTO implements Serializable {

    @JsonProperty("id")
    private String childrenId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("hasChildren")
    private Boolean hasChildren;

    @JsonProperty("image")
    private String image;
}
