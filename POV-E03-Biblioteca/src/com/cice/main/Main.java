package com.cice.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cice.biblioteca.Comics;
import com.cice.biblioteca.EntidadBase;
import com.cice.biblioteca.Libros;
import com.cice.biblioteca.Revistas;
import com.cice.business.IPrestado;

/**
 * Ejercicio Adicionla E03: Biblioteca
 * 
 * En la biblioteca hay libros, comics y revistas. Interesa guardar siempre la fecha de publicación y el nombre. 
 * 
 * Además, de los libros se debe guardar la edición, el ISBN y el autor (que es único); de las revistas el número y 
 * la periodicidad y de los comics el número y la colección.
 * 
 * Sólo presto mis libros y debo saber si un libro está prestado o no. Aunque de momento no lo necesito puede que el 
 * futuro quiera prestar otros elementos de mi biblioteca. ¿Utilizo una interfaz o herencia? ¿Qué métodos necesito?
 * 
 * Escribir la clase Disco - hereda de Multimedia (titulo (String), formato(enumerado), duración) teniendo en cuenta 
 * que los discos se pueden prestar.
 * 
 * Diseñar el sistema de biblioteca y crear un menú para las opciones
 * 	a) Número de libros prestados ¿Se podría reutilizar el método para discos?
 * 	b) Publicaciones anteriores a una fecha
 * 	c) Imprimir el listado de publicaciones y discos
 * 	d) Imprimir el listado de publicaciones y discos diferenciando por prestado o no
 * 
 * @author lorenarosessoler
 *
 */
public class Main {
	
	//Lista de todos los componentes de la Biblioteca
	private static List<EntidadBase> lista;
	
	public static void main(String[] args) {
		//1º cargamos la lista en el main llamando al método creado en esta clase
		rellenaLista();
	    
		//2º Mostrar menu
		int opcion = 0;
	    Scanner sc = new Scanner(System.in);
	    
	    do{
	    	System.out.println("========================");
	        System.out.println("=                      =");
	        System.out.println("= MENU BIBLIOTECA CICE =");
	        System.out.println("=                      =");
	        System.out.println("========================");
	        System.out.println("");
	        System.out.println("1.- Mostrar todos los prestados");
	        System.out.println("2.- Publicaciones anteriores a una fecha.");
	        System.out.println("3.- Imprimir el listado de publicaciones.");
	        System.out.println("4.- Imprimir el listado diferenciando prestado o no");
	        System.out.println("");
	        System.out.println("0.- Salir");
	        System.out.println("");
	        System.out.print("Elige una opción: ");
	        opcion = sc.nextInt();
	            
	        switch(opcion){
	        	case 1: 
	        		mostarPrestados();
	        		break;
	            case 2: 
	                 //buscarPublicacionPorFecha();
	                 break;
	            case 3: 
	                 //listarPublicaciones();
	                 break;
	            case 4: 
	                 //listarConOpcionPrestado();
	                 break;
	        }
	            
	    }while(opcion != 0); 
	}
	
	
	//Métdo rellenar lista
	private static void rellenaLista() {
		lista = new ArrayList<>();
	    lista.add(new Libros("Coleccionista", "ISBN2244", "Cervantes", "2017", "El ingenioso hidalgo Don Quijote de la Mancha"));
	    lista.add(new Libros("Bolsillo", "ISBN9987", "Lope de Vega", "2017", "Articulos de Lope"));
	    lista.add(new Revistas("2244", "Semanal", "2017", "Hola"));
	    lista.add(new Revistas("1025", "Semanal", "2017", "El Jueves"));
	    lista.add(new Comics("Coleccionista", "256", "2016", "Amazing Spiderman"));
	    lista.add(new Comics("Coleccionista", "1152", "2017", "Dragon Ball GT"));
	 }
	
	
	//Método mostra prestados
	private static void mostarPrestados() {
		
		for(EntidadBase objeto : lista) {
			
			if(objeto instanceof IPrestado) {
				
				boolean estado = ((IPrestado) objeto).esPrestado();
	            if(estado) {
	            	System.out.println("Prestado: " + objeto.getNombre());
	            } else {
	            	System.out.println("No prestado: " + objeto.getNombre());
	            }
	         }      
	     }      
	 }
}
