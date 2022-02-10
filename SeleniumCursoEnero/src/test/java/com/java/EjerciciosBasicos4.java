package com.java;

import java.util.Scanner;

public class EjerciciosBasicos4 {

	public static void main(String[] args) {
		/*
		 * Declara 2 variables numéricas enteras (con el valor que desees), he indica
		 * cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los
		 * valores para comprobar que funciona
		 */
		//	Scanner s = new Scanner(System.in);
		//		System.out.println("Type imput: ");
		//		String input = s.next();
		//		System.out.println("The imput is : " + input);
		//		int i = s.nextInt();

		Scanner s = new Scanner(System.in);
		System.out.println("Digite la primera variable: ");
		int var1 = s.nextInt();// 12000;

		System.out.println("Digite la segunda variable: ");
		int var2 = s.nextInt(); // 10000;

		System.out.println("Variable 1: " + var1);
		System.out.println("Variable 2: " + var2 + " \n ");

		if (var1 > var2) {
			System.out.println("La variable 1 es mayor");
		} else if (var1 < var2) {
			System.out.println("La variable 2 es mayor");
		} else if (var1 == var2) {
			System.out.println("Las variables son iguales");
		}
	}

}
