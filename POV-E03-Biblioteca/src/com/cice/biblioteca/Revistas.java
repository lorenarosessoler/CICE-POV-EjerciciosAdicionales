package com.cice.biblioteca;

public class Revistas extends EntidadBase {
	
	//Atributos de revista
	private String numero;
    private String periodicidad;

    
    //Constructor con parámetros
    public Revistas(String numero, String periodicidad, String fechaPublicacion, String nombre) {
    	super(fechaPublicacion, nombre);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    
    //Getter y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
}
