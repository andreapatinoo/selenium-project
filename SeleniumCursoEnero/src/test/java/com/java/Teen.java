/**
 * 
 */
package com.java;

/**
 * @author apo11
 *
 */
public class Teen {

	
	public static boolean hasTeen(int x, int y, int z)
	{
		//13 -19 inclusive
		if (x>12 && x<20 || y>12 && y<20  || z>12 && z<20  )
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean isTeen(int x)
	{
		//13 - 19 inclusive
		if (x>12 && x<20) {
			return true;
		}
		
		return false;
	}
	

}
