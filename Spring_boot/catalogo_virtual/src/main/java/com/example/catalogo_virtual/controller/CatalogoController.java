package com.example.catalogo_virtual.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogo_virtual.dao.api.CatalogoRepository;
import com.example.catalogo_virtual.model.Catalogo;

import com.example.catalogo_virtual.service.api.CatalogoServiceAPI;

@RestController
@RequestMapping("/catalogo/api/v1")
@CrossOrigin("*")
public class CatalogoController {
	@Autowired
	private CatalogoServiceAPI catalogoServiceAPI;
	
	@GetMapping(value="/all")
	public List<Catalogo> getAll(){
		return catalogoServiceAPI.getAll();
	}
	
	@GetMapping(value="/find/{id}")
	public Catalogo find(@PathVariable Long id) {
		return catalogoServiceAPI.get(id);
	}
	
//	@PostMapping(value="/save", consumes = MediaType.TEXT_PLAIN_VALUE )
	@PostMapping(value="/save" )
	public ResponseEntity<Catalogo> save(@RequestBody Catalogo catalogo){
		Catalogo obj = catalogoServiceAPI.save(catalogo);
		return new ResponseEntity<Catalogo>(obj,HttpStatus.OK);
	}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Catalogo> updateCatalogo(@RequestBody Catalogo catalogo, @PathVariable long id) {
		Catalogo catalogos = catalogoServiceAPI.get(id);
		if (catalogos == null)
			return ResponseEntity.notFound().build();
		catalogo.setId(id);
		catalogoServiceAPI.save(catalogo);
//		return new ResponseEntity<Catalogo>(catalogos,HttpStatus.OK);
		return new ResponseEntity<Catalogo>(catalogos,HttpStatus.OK);
	}
	
	
	@GetMapping(value="/delete/{id}")
	public ResponseEntity<Catalogo> detele(@PathVariable Long id){
//		id=Long.valueOf(id).longValue();
//		Long id=Long.valueOf(ids); 
		Catalogo catalogo = catalogoServiceAPI.get(id);
		if (catalogo != null) {
			catalogoServiceAPI.delete(id);
		} else {
			return new ResponseEntity<Catalogo>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Catalogo>(catalogo,HttpStatus.OK);
	}
}
