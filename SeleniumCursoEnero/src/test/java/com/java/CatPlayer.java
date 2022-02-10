package com.java;

public class CatPlayer {
	
	public static boolean isCatPlaying (boolean verano, int temperatura)
	{
		
		if (!verano && temperatura > 25 && temperatura <= 35)
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}

}
