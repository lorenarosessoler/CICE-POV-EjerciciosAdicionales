package com.cice.biblioteca;

import com.cice.business.IPrestado;

public class Libros extends EntidadBase implements IPrestado {
	
	//Atributos de libro
	private String edicion;
	private String isbn;
	private String autor;
	private boolean prestado;
	
	
	//Contructor con parámetros
	public Libros(String edicion, String isbn, String autor, String fechaPublicacion, String nombre) {
		//Le pasamos los atributos de la Entidad Base
		super(fechaPublicacion, nombre);
	    this.edicion = edicion;
	    this.isbn = isbn;
	    this.autor = autor;
	}
	
	
	//Setter y Getters
	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	//Métodos modificados
	@Override
	public boolean esPrestado() {
		return this.prestado;
	}

	@Override
	public void cambiarEstado() {
		this.prestado = !this.prestado;
	}
	    
	@Override
	public String toString(){
		return "Prestado: " + esPrestado() + " -> " + getNombre();
	}
}
