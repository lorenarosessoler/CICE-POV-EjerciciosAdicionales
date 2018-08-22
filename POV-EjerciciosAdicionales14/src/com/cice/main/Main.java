package com.cice.main;

import com.cice.logica.GestionEmpresa;

/**
 * Ejercicio Adicional A14: GESTIÓN EMPRESA
 * 
 * Realizar un programa que:
 * 	a) Permita generar empleados: nombre, apellido, dirección, DNI, mail
 * 	b) Permita generar Departamentos: nombre, ubicación, teléfono
 * 	c) Permita guardar el departamento al cual se asigna el empleado y el director de cada departamento (que es también un empleado)
 */
public class Main {

	public static void main(String[] args) {
		
		//Objeto de la clase GestionEmpresa
		GestionEmpresa servicio = new GestionEmpresa();
		
		System.out.println("======================================");
		System.out.println("BIENVENIDO A LA GESTIÓN DE TU EMPRESA");
		System.out.println("======================================");
		
		servicio.mostrarMenu();

	}

}
