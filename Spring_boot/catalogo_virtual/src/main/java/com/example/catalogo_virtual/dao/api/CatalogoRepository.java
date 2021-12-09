package com.example.catalogo_virtual.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.catalogo_virtual.model.Catalogo;

public interface CatalogoRepository extends MongoRepository <Catalogo, Long>{

}
