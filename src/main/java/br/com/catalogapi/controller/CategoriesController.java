package br.com.catalogapi.controller;

import br.com.catalogapi.dtos.requests.CategoriesRequestDTO;
import br.com.catalogapi.dtos.responses.CategoriesResponseDTO;
import br.com.catalogapi.facades.CategoriesFacade;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoriesController {

    @Autowired
    private CategoriesFacade categoriesFacade;

    @ApiOperation(value = "Post Categories v1")
    @PostMapping
    public ResponseEntity<CategoriesResponseDTO> create(@RequestBody CategoriesRequestDTO categoriesRequestDTO) {
        return new ResponseEntity<>(categoriesFacade.save(categoriesRequestDTO), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Get Categories v1")
    @GetMapping
    public ResponseEntity<List<CategoriesResponseDTO>> getCategories() {
        return new ResponseEntity<>(categoriesFacade.getCategories(), HttpStatus.OK);
    }
}