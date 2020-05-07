package br.com.catalogapi.repositories;

import br.com.catalogapi.entities.Categories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends MongoRepository<Categories, String> {

}
