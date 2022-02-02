package com.java;

public class EjerciciosBasicos2 {

	public static void main(String[] args) {
		/*
		 * Crear una clase (public static void main) con 4 variables tipo String con los
		 * siguientes valores:
		 * 
		 * Var 1 = “Cool” Var 2 = “Selenium con Java” Var 3 = “Curso de” Var 4 =
		 * “Testers”
		 * 
		 * El programa debe imprimir el siguiente mensaje utilizando la concatenación de
		 * Java:
		 * 
		 * “Curso de Selenium con Java CoolTesters”.
		 */

		String var1 = "Cool";
		String var2 = "Selenium con Java";
		String var3 = "Curso de ";
		String var4 = "Testers";

		String cadena = var3 + var2 + var1 + var4;
		

		System.out.println(cadena);
		

	}

}
