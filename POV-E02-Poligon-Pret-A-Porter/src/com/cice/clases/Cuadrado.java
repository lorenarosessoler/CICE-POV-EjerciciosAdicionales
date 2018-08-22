package com.cice.clases;

import com.cice.enums.EnumDesign;
import com.cice.enums.EnumMateriales;

public class Cuadrado extends AbstractFiguraGeometrica {
	
	//CARACTERÍSTICAS QUE TIENE CUADRADO - las hereda
	//Puede salir por temporada, se hace de otro material (tela), es estampado --> valor añadido 15%

	//Constructores
	public Cuadrado(EnumMateriales material, EnumDesign design) {
		super(material, design);
	}
	
	
	
	@Override
	public void descripcionProducto() {
		
	}

	
	

}
