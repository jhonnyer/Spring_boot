package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.service.api.PersonaServiceAPI;
import com.example.demo.commons.GenericServiceImpl;
import com.example.demo.dao.api.PersonaRepository;
import com.example.demo.model.Persona;

@Service
public class PersonaServiceImpl  extends GenericServiceImpl<Persona,Long> implements PersonaServiceAPI{
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public CrudRepository<Persona, Long>getDao(){
		return personaRepository;
	}
}