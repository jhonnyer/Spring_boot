package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.api.PersonaServiceAPI;

//Modelo 
import com.example.demo.model.Persona;

@RestController
@RequestMapping("/persona/api/v1")
@CrossOrigin("*")
public class PersonaController {
	@Autowired
	private PersonaServiceAPI personaServiceAPI;
	
//	Funcion para recuperar todos los registros 
	@GetMapping(value="/all")
	public List<Persona>getAll(){
		return personaServiceAPI.getAll();
	}
	
//	Funcion para buscar por id 
	@GetMapping(value="/find/{id}")
	public Persona find(@PathVariable Long id){
		return personaServiceAPI.get(id);
	}
	
//	Funcion para guardar datos en la BD; también sirve para actualizar un objeto
	@PostMapping(value= "/save")
	public ResponseEntity<Persona> save(@RequestBody Persona persona){
		Persona obj=personaServiceAPI.save(persona);
		return new ResponseEntity<Persona>(obj,HttpStatus.OK);
	}
	
//	Funcion para eliminar un registro 
	@GetMapping(value="/detele/{id}")
	public ResponseEntity<Persona> delete(@PathVariable Long id){
		Persona persona=personaServiceAPI.get(id);
		if (persona != null) {
			personaServiceAPI.delete(id);
		}
		else {
			return new ResponseEntity<Persona>(HttpStatus.OK);
		}
		return new ResponseEntity<Persona>(persona,HttpStatus.OK);
	}
}
