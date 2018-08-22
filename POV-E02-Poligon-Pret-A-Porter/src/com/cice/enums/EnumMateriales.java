package com.cice.enums;

public enum EnumMateriales {
	
	//Enumeramos los materiales con el precio en decimales
	CARTON(100d),
	PLASTICO(300d),
	MADERA(500d),
	TELA(600d)
	;
	
	private double precio;
	
	EnumMateriales (double precio) {
		this.precio=precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	

}
