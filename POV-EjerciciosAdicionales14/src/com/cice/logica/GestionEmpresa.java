package com.cice.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.cice.modelo.Departamento;
import com.cice.modelo.Empleado;

public class GestionEmpresa {
	
	//Variables
	private ArrayList <Empleado> listaEmpleados = new  ArrayList<>(); //Lista donde guardamos los empleados introducidos
	private ArrayList <Departamento> listaDepartamentos = new ArrayList<>(); //Lista donde guardamos los departamentos introducidos

	
	//Mostrar Menu de la Gestión de la Empresa
	public void mostrarMenu() {
		
		Scanner sc = new Scanner (System.in);
		int opcion = 0;
		
		System.out.println("======================================");
		System.out.println("BIENVENIDO A LA GESTIÓN DE TU EMPRESA");
		System.out.println("======================================");
		
		do {
			
			System.out.println("Esto es lo que podemos hacer por ti:");
			System.out.println("1 - Crear un Empleado");	
			System.out.println("2 - Crear un Departamento");
			System.out.println("3 - Asignar un Director al Departamento");
			System.out.println("4 - Asignar un Empleado al Departamento");			
			System.out.println("5 - Mostrar todos los empleados");
			System.out.println("6 - Mostrar todos los departamentos");			
			System.out.println("0 - Salir");
			System.out.print("Selecciona una opción: ");
			opcion= sc.nextInt();
			
			controles (opcion);
			
		} while (opcion != 0);
			
		sc.close();
	}
	
	
	
	//Controles del Menú
	private void controles (int opcion) {
		switch (opcion) {
			case 0:
				System.out.println("Gracias por utilizar nuestro servivio. Hasta Luego!");
				break;
			case 1:
				crearEmpleado();
				break;
			case 2:
				crearDepartamento();
				break;
			case 3:
				asignarDirectorDepartamento();
				break;
			case 4:
				asignarEmpleadoDepartamento();
				break;
			case 5:
				mostrarEmpleados();
				break;
			case 6:
				mostrarDepartamentos();
				break;
			default:
				System.out.println("La opción seleccionada no es válida, selecciona otra opción");
		}	
	}
	
	
	
	//Método - Crear Empleado
	private void crearEmpleado(){
		Scanner sc = new Scanner(System.in);
		String respuesta = " ";
		Empleado empleado = new Empleado(); //Objeto Empleado - Uso el constructor sin parámetros
		
		do {
			empleado = new Empleado(); // si no utilizaramos la inicialización dentro del bucle nos mostraría siempre el último emplead
			
			System.out.print("Introduce el nombre: ");
			empleado.setNombre(sc.next());
			System.out.print("Introduce el apellido: ");
			empleado.setApellido(sc.next());
//			System.out.print("Introduce el DNI: ");
//			empleado.setDni(sc.next());
//			System.out.print("Introduce el dirección: ");
//			empleado.setDireccion(sc.next());
//			System.out.print("Introduce el mail: ");
//			empleado.setMail(sc.next());
			System.out.println(empleado.toString()); //Muestra los datos que se han introducido
			System.out.println("-----------------------");
			System.out.println("¿Quieres crear otro empleado (s/n)");
			respuesta = sc.next();
			System.out.println("-----------------------");
		
			listaEmpleados.add(empleado);	//Añadimos el empleado introducido a la lista de empleados

		} while (respuesta.equals("s"));
	}
	
	
	
	//Método - Mostrar Empleados
	private void mostrarEmpleados() {
		System.out.println("EMPLEADOS:");
		for (Empleado emp : listaEmpleados) {
			System.out.println(listaEmpleados.indexOf(emp)+ " . " +emp.toString()); //Muestra el nombre y el apellido de cada empleado
		}
		System.out.println("-----------------------");
	}
	
	
	
	//Método - Crear Departamento
	private void crearDepartamento() {
		Scanner sc = new Scanner(System.in);
		String respuesta = " ";
		Departamento departamento = new Departamento(); //Objeto Departamento

		do {
			
			departamento = new Departamento ();
			System.out.print("Introduce el nombre: ");
			departamento.setNombre(sc.next());
//			System.out.print("Introduce la ubicación: ");
//			departamento.setUbicacion(sc.next());
//			System.out.print("Introduce el teléfono: ");
//			departamento.setTelefono(sc.next());
			System.out.println("-----------------------");
			System.out.println("¿Quieres crear otro departamento (s/n)");
			respuesta = sc.next();
			System.out.println("-----------------------");
			
			listaDepartamentos.add(departamento);//Añadimos el departamento introducido a la lista de empleados
			
		} while(respuesta.equals("s"));
	}
	
	
	
	//Método - Mostrar Departamentos
		private void mostrarDepartamentos() {
			System.out.println("DEPARTAMENTOS");
			for (Departamento dep : listaDepartamentos) {
				System.out.println(listaDepartamentos.indexOf(dep)+ " . " +dep.getNombre());
			}
			System.out.println("-----------------------");
		}

		
		
	//Método Asignar Director a un Departamento
	private void asignarDirectorDepartamento() {
		Scanner sc = new Scanner (System.in);
		//String respuesta = " ";
		//Empleado director = new Empleado(); //Objeto Empleado - Uso el constructor sin parámetros
		
		//do {
		//	director = new Empleado();
			
			//Mostrar la lista de departamentos y seleccionar el departamento al que quiero asignar un director
			int departamentoSeleccionado = 0;
			System.out.println("Departamentos disponibles: ");
			mostrarDepartamentos();
			System.out.print("Selecciona el departamento al que quieres asignar un director: ");
			departamentoSeleccionado = sc.nextInt();
			
			//Mostrar la lista de empleados y seleccionar el empleado selecionado para director
			int empleadoSeleccionado = 0;
			System.out.println("Empleados disponibles: ");
			mostrarEmpleados();
			System.out.print("Selecciona el empleado al que quieres asignar como director: ");
			empleadoSeleccionado = sc.nextInt();
			
			//Asigno al departamento seleccionado el empleado elegido como director
			Departamento departamentoElegido = listaDepartamentos.get(departamentoSeleccionado);
			Empleado empleadoElegido = listaEmpleados.get(empleadoSeleccionado);
			departamentoElegido.setDirector(empleadoElegido);
			System.out.println("El Director del departamento " +departamentoElegido.getNombre()+ " es " +departamentoElegido.getDirector());
			System.out.println("-----------------------");

		//} while (respuesta.equals("s"));
			
	}
	
	
	
	//Método Asignar Empleado a un Departamento
	private void asignarEmpleadoDepartamento() {
		Scanner sc = new Scanner (System.in);
		
		//Mostrar la lista de departamentos y seleccionar el departamento al que quiero asignar un empleado
		int departamentoSeleccionado = 0;
		System.out.println("Departamentos disponibles: ");
		mostrarDepartamentos();
		System.out.print("Selecciona el departamento al que quieres asignar un empleado: ");
		departamentoSeleccionado = Integer.parseInt(sc.nextLine());
		
		//Mostrar la lista de empleados y seleccionar el empleado/s elegido/s para añadir al departamento
		int [] empleadosSeleccionados;
		System.out.println("Empleados disponibles: ");
		mostrarEmpleados();
		//Cogemos los empleados introducidos y los separamos cogiendo los ids de los empleados
		System.out.print("Selecciona uno o varios empleados (Separados por una coma, ejemplo: 1,2) para añadir al departamento");
		String[] aux = sc.nextLine().split(",");
		empleadosSeleccionados = new int [aux.length];
		//Bucle donde cojo los ids de los empleados introducidos
		for (int i = 0; i < aux.length; i++) {
			empleadosSeleccionados[i]=Integer.parseInt(aux[i]);
		}
		
		//Cojo cada id, recojo el empleado y lo almaceno en el departamento 
		for (int idEmpleado : empleadosSeleccionados) {
			Empleado empleadoElegido = listaEmpleados.get(idEmpleado);

			//VERSION JAVA
			//Departamento departamentoElegido = listaDepartamentos.get(departamentoSeleccionado);
			//departamentoElegido.getListaEmpleados().add(empleadoElegido);
			
			//VERSION PRO
			listaDepartamentos.get(departamentoSeleccionado).getListaEmpleados().add(empleadoElegido);
		}
		System.out.println("Estos son los empleados que han añadido al departamento de " +listaDepartamentos.get(departamentoSeleccionado).getNombre() );
		for (Empleado emp : listaDepartamentos.get(departamentoSeleccionado).getListaEmpleados()) {
			System.out.println(emp.toString());
		}
		System.out.println("-----------------------");
	
		
		//EJEMPLOS
		//Convertimos un array de Strings en un array de int
		//empleadosSeleccionados = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
		//Lambda
		//listaDepartamentos.stream().allMatch(k -> k.getNombre().equals("Gustavo"));
	}	

}
