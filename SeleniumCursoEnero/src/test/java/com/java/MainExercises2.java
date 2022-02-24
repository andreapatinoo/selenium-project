package com.java;

public class MainExercises2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exercise 1
		/*
		 * shouldWakeUp (true, 1); ? should return true
		 * shouldWakeUp (false, 2); ? should return false since the dog is not barking.
		 * shouldWakeUp (true, 8); ? should return false, since it's not before 8.
		 * shouldWakeUp (true, -1); ? should return false  * */
		Boolean awaken  = BarkingDog.shouldWakeUp(true, 8);
		System.out.println("awake: " + awaken);
		System.out.println(" ");

		
		
		//Exercise 2
		// Highway 1, Normal 2 , School 3		
		String msg = CarSpeed.speedLimit(110 , 3);
		System.out.println(msg);
		System.out.println(" ");
		
		
		//Exercise 3
		/*
		 * areEqualByThreeDecimalPlaces(-3.1756, -3.175); ? should return true 
		 * areEqualByThreeDecimalPlaces(3.175, 3.176); ? should return false 
		 * areEqualByThreeDecimalPlaces(3.0, 3.0); ? should return true 
		 * areEqualByThreeDecimalPlaces(-3.123, 3.123); ? should return false 
		 */
		boolean areEqual = DecimalComparison.areEqualByThreeDecimalPlaces2(3.170, 3.174);
		System.out.println("Same numbers " + areEqual);
		System.out.println(" ");
	
		
		//Exercise 4
		//		* isCatPlaying (verdadero, 10); debe devolver falso
		//		* isCatPlaying (falso, 36); debe devolver falso 
		//		* isCatPlaying (falso, 35); debería volver a verdadero 
		boolean isPlaying = CatPlayer.isCatPlaying(false, 35);
		System.out.println("Cat is playing " + isPlaying); System.out.println(" ");
		
		
		//Exercise 5
		/* printEqual (1, 1, 1); debe imprimir texto Todos los números son iguales
		 * printEqual (1, 1, 2); deben imprimir texto Ni todos son iguales o diferentes
		 * printEqual (-1, -1, -1); debe imprimir el texto Valor no válido 
		 * printEqual (1, 2, 3); debe imprimir texto Todos los números son diferentes	 */
		NumbersVerifier.printNumberVerifier(1, 2, 1); System.out.println(" ");
		
		// Exercise 6
		/*sumOdd(1, 100); → should return 2500
		* sumOdd(-1, 100); →  should return -1
		* sumOdd(100, 100); → should return 0
		* sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
		* sumOdd(100, -100); → should return -1
		* sumOdd(100, 1000); → should return 247500
		 * */
		System.out.println("Odd Sum  is equals to " + SumOdd.sumOdd(100, 1000)); System.out.println(" ");
		
		
		//Exercise 7
		/*
		* printMegaBytesAndKiloBytes(2500); ? should print the following text: "2500 KB = 2 MB and 452 KB"
		* printMegaBytesAndKiloBytes(-1024); ? should print the following text: "Invalid Value" because parameter is less than 0.
		* printMegaBytesAndKiloBytes(5000); ? should print the following text: "5000 KB = 4 MB and 904 KB"*/
	
		Megakilobytes kb = new Megakilobytes();
		kb.printMegaBytesAndKiloBytes(5000); System.out.println(" ");
	
	
		//Exercise 8
		/* 		 hasEqualSum(1, 1, 1);  deberia regresar FALSE porque la suma de 1+1 no es 1
		 *       hasEqualSum(1, 1, 2);  deberia regresar TRUE porque la suma de 1+1 si es 2  */
		System.out.println("The third is the sum: " + SumVerifier.hasEqualSum(1, 2, 2)); System.out.println(" ");
		
		
		
	}

}
