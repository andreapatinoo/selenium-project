package com.java;

public class Megakilobytes {



	public void printMegaBytesAndKiloBytes(int kiloBytes)
	{
		String msg;
		
		if(kiloBytes < 0)
		{
			msg = "Invalid Value.";
		}
		else {
//			double result= kiloBytes * 0.0009765625;
//			int MB =(int)result;
//			int KB = (int) ((result - MB)*1024);
			
			int MB=(int)(kiloBytes/1024);
			int KB = (int)  kiloBytes % 1024;
			//double other = kiloBytes % 1000;
					 
			msg = kiloBytes + " KiloBytes = " +  MB + " MB and " + KB + " KiloBytes.";
		}
		System.out.println(msg);
	}
}


