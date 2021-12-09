package com.example.catalogo_virtual.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;

//@Entity
public class Catalogo {
	@Id
//	@Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String categoria;
	private String nombre;
	private String descripcion;
	private Integer precio;
	private Boolean disponibilidad;
	private Number cantidad;
	private String imagen;
	
	
	public Catalogo() {

	}
	public Catalogo(long id, String categoria, String nombre, String descripcion, Integer precio, Boolean disponibilidad,
			Number cantidad, String imagen) {
		super();
		this.id = id;
//		this.id = UUID.randomUUID().toString();
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
		this.cantidad = cantidad;
		this.imagen=imagen;
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
	public Boolean getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public Number getCantidad() {
		return cantidad;
	}
	public void setCantidad(Number cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
}
