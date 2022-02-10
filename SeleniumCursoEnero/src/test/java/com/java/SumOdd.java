package com.java;

public class SumOdd {

	//	* sumOdd(1, 100); → should return 2500
	//			* sumOdd(-1, 100); →  should return -1
	//			* sumOdd(100, 100); → should return 0
	//			* sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
	//			* sumOdd(100, -100); → should return -1
	//			* sumOdd(100, 1000); → should return 247500
	
	public boolean isOdd(int number) // impar
	{
		if (number > 0 && number %2 != 0) {
			
			return true;
				
		}else
		{
			return false;
		}
			
	}
	
	public static int sumOdd(int start, int end)
	{
		int sum = 0;
		SumOdd sm = new SumOdd();
		
		if (start <= end && start >0 && end > 0) {	
		for (int i=start; i<= end; i++)
		{
			if (sm.isOdd(i))
			{
				sum = sum + i;
			}
		}
		
		}else
		{
			sum = -1;
		}
		return sum;
	}
	
	
}
