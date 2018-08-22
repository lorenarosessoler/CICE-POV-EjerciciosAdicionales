package com.cice.biblioteca;

public class EntidadBase {
	
	//Atributos que todas tienen en común
	private String fechaPublicacion;
	private String nombre;
	
	
	//Constructor con parámetos
	public EntidadBase(String fechaPublicacion, String nombre) {
		this.fechaPublicacion = fechaPublicacion;
	    this.nombre = nombre;
	}
	
	
	//Getter y Setters
	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	 }
}
