package com.cice.clases;

import java.util.ArrayList;
import java.util.List;

import com.cice.enums.EnumDesign;
import com.cice.enums.EnumMateriales;
import com.cice.interfaces.IFiguraGeometrica;

/**
 * Ejercicio Adicional E02: POLIGON-PRET-A-PORTER
 * 
 * Una empresa está teniendo mucho éxito con la venta de polígonos.
 * 
 * Los polígonos los hacen de distintos materiales, principalmente cartón, plástico y madera.
 * 
 * Cada polígono tiene un precio, 100, 300 y 500 euros respectivamente... todo un chollo, oiga.
 * 
 * Los polígonos se encuentran formados de puntos. Este año se llevan mucho los polígonos coloreados. 
 * Se diferencian de los polígonos normales porque llevan color. Valen un 15% más.
 * 
 * Para la colección primavera-verano del 2013 se han sacado al mercado pentágonos coloreados con las firmas de los principales diseñadores... 
 * esto va a ser un pelotazo. Y sólo valen un 20% más. Cómprate uno ya!!!
 * 
 * @author lorenarosessoler
 */

public class Main {
	
	public static void main (String[] args) {
		
		List<IFiguraGeometrica> listaFG = new ArrayList<IFiguraGeometrica>();
		listaFG.add(new Cuadrado(EnumMateriales.MADERA, EnumDesign.ESTAMPADO));
		listaFG.add(new Pentagono(EnumMateriales.PLASTICO, EnumDesign.COLOREADO_DEAUTOR));

		
		for (IFiguraGeometrica figuraGeometrica : listaFG) {
			figuraGeometrica.mostrarPrecio();
		
		}
	}

}


