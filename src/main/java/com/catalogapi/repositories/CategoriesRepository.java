package com.catalogapi.repositories;

import com.catalogapi.entities.Categories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends MongoRepository<Categories, String> {

}
