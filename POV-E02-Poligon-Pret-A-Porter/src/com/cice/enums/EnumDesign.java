package com.cice.enums;

public enum EnumDesign {
	
	BASICO(1.0d),
	COLOREADO(1.15d),
	COLOREADO_DEAUTOR(1.20d),
	ESTAMPADO(1.17d);
	
	private double incremento;
	
	EnumDesign(double incremento) {
		this.incremento = incremento;
	}
	
	public double getIncremento() {
		return incremento;
	}
	
}
