package com.example.demo.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;

//mondoRepository extiende del modelo 
@Repository
public interface PersonaRepository extends MongoRepository<Persona, Long> {
//public interface PersonaRepository extends CrudRepository<Persona, Long> {
//	Persona findByUsername(String categoria);
//	Persona findByUsername(String nombre);
//	Persona findByUsername(String descripcion);
//	Persona findByUsername(Integer precio);
//	Persona findByUsername(String disponibilidad);
//	Persona findByUsername(Integer cantidad);
}
