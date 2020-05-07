package com.catalogapi.controller;

import com.catalogapi.dtos.requests.CategoriesRequestDTO;
import com.catalogapi.dtos.responses.CategoriesResponseDTO;
import com.catalogapi.facades.CategoriesFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoriesController {

    @Autowired
    private CategoriesFacade categoriesFacade;

    @PostMapping
    public ResponseEntity<CategoriesResponseDTO> create(@RequestBody CategoriesRequestDTO categoriesRequestDTO) {
        return new ResponseEntity<>(categoriesFacade.save(categoriesRequestDTO), HttpStatus.CREATED);
    }
}
