package com.java;

public class AreaCalculator {

	 //PI 3,1416 area= PI*R^2
	static double area = 0.0;
	public static double area (double radius)
	{
		area = Math.PI * radius*radius;
		
		if(radius < 0)
		{
			return -1;
		}else
		{
			return area;
		}
	}

	public static double area (double x, double y)
	{
		if(x<0 || y<0) {
		
		return -1;
	
		} else {
			
		area = x*y;
		return area;
	}
	
	}
}

