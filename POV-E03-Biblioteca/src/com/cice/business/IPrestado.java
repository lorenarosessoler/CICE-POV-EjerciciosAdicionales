package com.cice.business;

public interface IPrestado {
	
	//Método que me devolverá el estado 'prestado' del objeto
   boolean esPrestado();
   
   
   //Método que cambia el estado de 'prestado' del objeto.
   void cambiarEstado();
}
