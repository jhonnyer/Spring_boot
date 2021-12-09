package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Persona {
	@Id
	private long id;
	private String categoria;
	private String nombre;
	private String descripcion;
	private Integer precio;
	private String disponibilidad;
	private Integer cantidad;
	
	
	public Persona() {
	}
	
	public Persona(long id, String categoria, String nombre, String descripcion, Integer precio, String disponibilidad,
			Integer cantidad) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
		this.cantidad = cantidad;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
