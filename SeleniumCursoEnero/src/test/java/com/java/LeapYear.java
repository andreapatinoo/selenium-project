package com.java;

public class LeapYear {

	public static boolean isLeapYear(int year) {
		
		if (year >=1 || year <=9999)
		{
			if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
			{
				return true;
			}
		}
		return false;
		
//		if (year >=1 || year <=9999)
//		{
//		 	if (year%4 ==0)
//		 	{
//		 		if (year%100==0)
//		 		{
//		 			if (year%400 ==0)
//		 			{
//		 				return true;
//		 			}else
//		 			{
//		 				return false;
//		 			}
//		 			
//		 		}
//		 		else
//		 		{
//		 			return false;//5,2
//		 		}
//		 	}else
//		 	{
//		 		return false;//5.2
//		 	}
//		 	
//		}
//		else
//		{
//			return false;
//		}

	}
	
	public static int getDaysInMonth (int month, int year)
	{
		if(month <1 || month >12 || year <1 || year >9999)
		{
			return -1;
		
		}else if (month <=7 && month %2 !=0 || month >7 && month %2 ==0) 
		{
			return 31;
			
		}else 
			if (isLeapYear(year)&& month == 2)
			{
				return 29;
			}else if(month ==2)
			{
				return 28;
			}
		{
			return 30;
		}
		
	}


}
