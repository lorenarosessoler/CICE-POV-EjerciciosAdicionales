package com.cice.biblioteca;

public class Comics extends EntidadBase {
	
	//Atributos de comic
	private String coleccion;
	private String numero;

	
	//Constructor con parámetros
	public Comics(String coleccion, String numero, String fechaPublicacion, String nombre) {
		super(fechaPublicacion, nombre);
	    this.coleccion = coleccion;
	    this.numero = numero;
	 }

	
	//Getter y Setters
	public String getColeccion() {
		return coleccion;
	}
	
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
