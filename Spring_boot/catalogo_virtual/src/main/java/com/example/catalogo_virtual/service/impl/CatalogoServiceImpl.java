package com.example.catalogo_virtual.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.catalogo_virtual.commons.GenericServiceImpl;
import com.example.catalogo_virtual.dao.api.CatalogoRepository;
import com.example.catalogo_virtual.model.Catalogo;
import com.example.catalogo_virtual.service.api.CatalogoServiceAPI;
@Service
public class CatalogoServiceImpl extends GenericServiceImpl<Catalogo, Long> implements CatalogoServiceAPI{
	
	@Autowired
	private CatalogoRepository catalogoRespository;
	@Override
//	crudRepository es hijo de mongoRepisitory
	public CrudRepository<Catalogo, Long> getDao(){
		return catalogoRespository;	
	}
}
