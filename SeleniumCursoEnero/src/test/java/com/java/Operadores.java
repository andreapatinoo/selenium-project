package com.java;

public class Operadores {

	public static void main(String[] args) {
		// OPERATORS
		
		// operadores artimeticos
		int x = 2;
		int y = 2;

	int suma = x + y;
	int resta = x - y;
	int mult = x * y;
	int div = x / y;
	
	double z = 2.23;
	double a = 4.34;
	double mult2 = z * a;
	
	System.out.println ("suma " + suma);
	System.out.println ("resta " + resta);
	System.out.println ("mult " + mult);
	System.out.println ("div " + div);
	
	System.out.println ("El valor double es " + mult2);
	
	//Operadores unarios
	int unario = 2;
	++unario;
	System.out.println (unario);
	
	// Operadores relacionales 
	/*
	 * igual ==
	 * diferente a !=
	 * mayour que >
	 * mayor o igual que >=
	 * menor que <
	 * menor o igual que <=
	 * */
	
	int or = 2 ;
	int or2 = 3;
	
	if (or > or2)
	{
		System.out.println ("true");

	}
	else
	{
		System.out.println (false);
	}
	
	String msg = "Hola";
	String msg2 = "Hola";
	
	if (msg == msg2)
	{		System.out.println ("true");

	}else{
		System.out.println ("false");
	}
	
	
	if (msg.equals(msg2))
	{		System.out.println ("true");

	}else{
		System.out.println ("false");
	}
	
	//Operadores condicionales
	/*
	 * AND &&
	 * OR ||
	 * */
	
	int oper1 = 2;
	int oper2 = 2;
	int oper3 = 4;
	int oper4 = 3;
	
	if (oper1==oper2 && oper3==oper4) {
		System.out.println ("Todos los valores son iguales");
	}else {
		System.out.println ("Algun vlr es diferente");
		}
	
	
	if (oper1==oper2 || oper3==oper4) {
		System.out.println ("OR Todos los valores son iguales");
	}else {
		System.out.println ("OR Algun vlr es diferente");
		}
	}
}

