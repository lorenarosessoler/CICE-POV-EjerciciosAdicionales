package com.cice.modelo;

import java.util.ArrayList;

/*
 * Modelo de Datos de Departamento
 */
public class Departamento {
	
	//Definir variables de Departamento
	private String nombre;
	private String ubicacion;
	private String telefono;
	
	//Variables para definir al Director
	private Empleado director;	//Creamos Director
	private ArrayList<Empleado> listaEmpleados; //Lista de empleados
	
	
	//Constructor sin parámetros
	public Departamento () {
		director = new Empleado();
		listaEmpleados = new ArrayList<>();
	}
	
	
	//Constructor con parámetros - No incluimos al Director ni a la lista de empleados
	public Departamento(String nombre, String ubicacion, String telefono, Empleado director, ArrayList <Empleado> listaEmpleados) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.telefono = telefono;
		this.director = director;
		this.listaEmpleados = listaEmpleados;
	}

	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Empleado getDirector() {
		return director;
	}

	public void setDirector(Empleado director) {
		this.director = director;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	


	
	

}
