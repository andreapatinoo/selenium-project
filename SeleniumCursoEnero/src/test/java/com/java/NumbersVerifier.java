package com.java;

public class NumbersVerifier {

	/*
	 * Escribe un método que se llame imprimirVerificadorNumeros con 3 
	 * parámetros de tipo int. El método no debe devolver nada (vacío).

		Si uno de los parámetros es menor que 0, imprima el texto "Valor no válido".
		
		Si todos los números son iguales, imprima el texto "Todos los números son iguales"
		
		Si todos los números son diferentes, imprima el texto "Todos los números son diferentes".
		
		De lo contrario, imprima "Ni todos son iguales ni diferentes".
		
		EJEMPLOS DE ENTRADA / SALIDA:
		
		* printEqual (1, 1, 1); debe imprimir texto Todos los números son iguales
		* printEqual (1, 1, 2); deben imprimir texto Ni todos son iguales o diferentes
		* printEqual (-1, -1, -1); debe imprimir el texto Valor no válido
		* printEqual (1, 2, 3); debe imprimir texto Todos los números son diferentes
	 * */
	
	public static void printNumberVerifier (int x, int y, int z)
	{
		if (x < 0 || y < 0 || z < 0)
		{
			System.out.println("Invalid Value");
		} else if (x == y && y == z && z == x ){
			
				System.out.println("All values are the same");
			} else if (x != y && y != z && z != x) {
				System.out.println("All values are different");
			} else if (x != y || y != z || z != x) {
				System.out.println("Neither equal nor different values");
			}
		}
		
	
}
