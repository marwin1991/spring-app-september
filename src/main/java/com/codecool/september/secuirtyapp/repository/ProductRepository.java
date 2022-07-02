package com.codecool.september.secuirtyapp.repository;

import com.codecool.september.secuirtyapp.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
