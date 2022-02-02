package com.java;

import java.util.Scanner;

public class EjerciciosBasicos5 {

	public static void main(String[] args) {
		/*
		 * Crea un programa donde te pida un número y muestra si es positivo o negativo 
		 * y si es par o impar
		 */

		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite el número: ");
		int var1 = s.nextInt();//12000;
		
		
		
		System.out.println("El numero ingresado es : " + var1 + " \n ");
		
		
		if (var1 > 0) {
			System.out.print("Es positivo");
		} else {
			if (var1 < 0) {
				System.out.print("Es negativo");
			} 
		}
		
		double div = var1%2;
		
		if (div == 0){
			System.out.println(" y par. " );
		} else {
			{
				System.out.println(" e impar. " );
			} 
		}
	}

}


