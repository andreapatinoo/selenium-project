package com.java;

public class DecimalComparison {

	// 3,123 and 3,125
	// cast int 
	// parte entera 3 equals 3 or  3 - 3 = 0 (contador = 1)
	// parte decimal
	//castear el resultado de  123 /100 y 125/100 == 0 (no) 
	// parte entera 1 -1 = 0  (contador 2 = 2)
	

	public static boolean areEqualByThreeDecimalPlaces (double x, double y ) // 3.124, 3.123
	{
		int intX = 0; int intY = 0; double pivX =0.0; double pivY= 0.0;
				
		intX = (int)x;
		intY = (int)y;
				
		int count = -1;
		System.out.println("x " + x + " y " + y);

		for (int i = 0; i < 4; i++) {
			
			if (intX == intY ) {
				//System.out.println("intX " + intX + " intY " + intY);
				//System.out.println("pivX " + pivX + " pivY " + pivY);
				
				pivX = x - intX;
				pivY = y - intY;
				x = (pivX * 10); // 1,24
				y = (pivY * 10);// 1,23
				intX = (int)x;
				intY = (int)y;
				count++;
			} else if (intX != intY) {
				//System.out.println("Diferentes intX " + intX + " intY " + intY);
				//i=4;
				break;
			}

		}
		if (count ==3){
			return true;}
		else {
			return false;
		}
		
	}
	
	public static boolean areEqualByThreeDecimalPlaces2(double n1, double n2) {

        n1 = n1*1000;
        n2 = n2*1000;
 
        n1 = (int) n1;
        n2 = (int) n2;

        return n1==n2 ? true : false;

//        if(n1==n2) {
//            return true;
//        }else {
//            return false;
//        }

    }
	
}
