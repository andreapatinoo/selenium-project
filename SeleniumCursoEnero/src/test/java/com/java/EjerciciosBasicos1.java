package com.java;

public class EjerciciosBasicos1 {

	public static void main(String[] args) {
		/*Crear una clase (public static void main) 
		 * con tres variables de tipo double e imprimir la suma, resta, multiplicación
		 *  y división de las 3 variables. */

		double var1 = 1.1;
		double var2 = 2.2;
		double var3 = 3.3;
	
		double suma = var1 + var2 + var3;
		double resta = var1 - var2 - var3;
		double mult = var1 * var2 * var3;
		double div = var1 / var2 / var3;
		
		System.out.println("suma " + suma);
		System.out.println("resta " + resta);
		System.out.println("muliplicacion " + mult);
		System.out.println("division "  + div);
		
	}

}
