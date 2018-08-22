package com.cice.clases;

import com.cice.enums.EnumDesign;
import com.cice.enums.EnumMateriales;
import com.cice.interfaces.IFiguraGeometrica;

public abstract class AbstractFiguraGeometrica implements IFiguraGeometrica {

	private EnumMateriales material;
	private EnumDesign design;
	private double precio;
	
	
	//protected - se utiliza solo en las clases heredadas y las del mismo paquete
	//Figura geométrica siempre estará hecha de un matrial, siempre le paso la lista de materiales
	protected AbstractFiguraGeometrica(EnumMateriales material, EnumDesign design) {
		this.material = material;
		this.design = design;
		//Inicialización por defecto con un método ya preestablecido(método privado)
		this.precio = calcularPrecio();
		//Seria lo mismo que lo anterior --> más rara
		//setPrecio(calcularPrecio());
	}


	//Getter y Setter de precio
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
	}
	
	
	//Método calcularPrecio con el incremento que tiene según el diseño
	private double calcularPrecio() {
		double precioCalculado = 0d;
		precioCalculado = material.getPrecio()*design.getIncremento();
		return precioCalculado;
	}
	
	
	@Override
	public void mostrarPrecio() {
		System.out.println("El precio del " +this.getClass().getSimpleName()+ " es: " +getPrecio());

	}
}
