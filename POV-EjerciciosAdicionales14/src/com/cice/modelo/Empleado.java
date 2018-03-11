package com.cice.modelo;

/*
 * Modelo de Datos de Empleado
 */
public class Empleado {
	
	//Definir variables de Empleado
	private String nombre;
	private String apellido;
	private String direccion;
	private String dni;
	private String mail;
	
	
	//Constructor sin parámetros
	public Empleado() {
		
	}
	
	//Constructor con parámetros
	public Empleado(String nombre, String apellido, String direccion, String dni, String mail) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.mail = mail;
	}

	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		String respuesta = (nombre+ " " +apellido);
		return respuesta;
	}

}
