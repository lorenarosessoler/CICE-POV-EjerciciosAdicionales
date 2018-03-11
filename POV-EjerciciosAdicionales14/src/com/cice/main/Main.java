package com.cice.main;

import com.cice.logica.GestionEmpresa;

/*
 * EJERCICIO EXTRA 14
 * Realizar un programa que:
 * 	a) Permita generar empleados: nombre, apellido, dirección, DNI, mail
 * 	b) Permita generar Departamentos: nombre, ubicación, teléfono
 * 	c) Permita guardar el departamento al cual se asigna el empleado y el director de cada departamento (que es también un empleado)
 */
public class Main {

	public static void main(String[] args) {
		
		GestionEmpresa servicio = new GestionEmpresa();
		servicio.mostrarMenu();

	}

}
