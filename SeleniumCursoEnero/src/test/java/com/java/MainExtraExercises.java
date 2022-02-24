package com.java;

public class MainExtraExercises {

	public static void main(String[] args) {
		
		// LEAP YEAR 
		//		The following years are not leap years:
		//		1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
		//		This is because they are evenly divisible by 100 but not by 400.
		//1600, 2000, 2400 .. no 2017
		System.out.println("is a Leap Year: " + LeapYear.isLeapYear(2000) ); System.out.println(" ");

		
		// AREA
		System.out.println("Area of circle " + AreaCalculator.area(3) );
		System.out.println("Area of rectangle " + AreaCalculator.area(5,3) ); System.out.println(" ");
		
		
		// DAYS OF THE MONTH
		//En Mar May Jul Ago Oct Dic = 31
		//  Abr Jun Sep Nov = 30
		// 		Feb 28 en biciestos 29 
		System.out.println("Days of the month the year..." +LeapYear.getDaysInMonth(2,2001) ); System.out.println(" ");
		
		//Extra II ControlFlow
		
		// (3.4, 2.1, 1.5, 2))  (-3.4, 2.1, 1.5, 2) (2.75, 3.25, 2.5, 1);
		System.out.println("Buckets to buy: " + ControlFlow.getBucketCount(2.75, 3.25, 2.5, 1)); 
		
		//(-3.4, 2.1, 1.5) , (3.4, 2.1, 1.5)= 5 , (7.25, 4.3, 2.35) = 14 
		System.out.println("Buckets to buy without extras:  " + ControlFlow.getBucketCount(7.25, 4.3, 2.35)); 
		
		//(3.4, 1.5); →  3, (6.26, 2.2) → 3 , (3.26, 0.75)→ 5
		System.out.println("Buckets Only Area:  " + ControlFlow.getBucketCount(3.26, 0.75));System.out.println(" ");
		
		
		
		//Extra II OOP-Person TEST CODE:

			Person person = new Person();
			person.setFirstName("");   // firstName is set to empty string
			person.setLastName("");    // lastName is set to empty string
			person.setAge(10);
			System.out.println("fullName= " + person.getFullName());
			System.out.println("teen= " + person.isTeen());
			person.setFirstName("John");    // firstName is set to John
			person.setAge(18);
			System.out.println("fullName= " + person.getFullName());
			System.out.println("teen= " + person.isTeen());
			person.setLastName("Smith");    // lastName is set to Smith
			System.out.println("fullName= " + person.getFullName());
			
			System.out.println(" ");
			
			
			// Extra Simple Calculator TEST CODE:
			SimpleCalculator calculator = new SimpleCalculator();
			calculator.setFirstNumber(5.0);
			calculator.setSecondNumber(4);
			System.out.println("add= " + calculator.getAdditionResult());
			System.out.println("subtract= " + calculator.getSubtractionResult());
			calculator.setFirstNumber(5.25);
			calculator.setSecondNumber(0);
			System.out.println("multiply= " + calculator.getMultiplicationResult());
			System.out.println("divide= " + calculator.getDivisionResult());
			System.out.println(" ");
			
			
			// Extra  Teen
			//	(9, 99, 19);  true, (23, 15, 42) true, (22, 23, 34) false 
			System.out.println( "Has Teen " + Teen.hasTeen(9, 99, 19));
			
			// (9) false , (13) true
			System.out.println( "Is Teen " + Teen.isTeen(13));
	}

}
