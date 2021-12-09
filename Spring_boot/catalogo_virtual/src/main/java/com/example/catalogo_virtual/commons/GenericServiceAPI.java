package com.example.catalogo_virtual.commons;

import java.io.Serializable;
import java.util.List;

//este archivo evita colocar codigo repetido en el catalogoServiceAPI y catalogoServiceImpl
public interface GenericServiceAPI<T, ID> extends Serializable {
	T save(T entity);

	void delete(ID id);
	
	T get(ID id);
	
	List<T> getAll();
	
//	void update(ID id);
}
