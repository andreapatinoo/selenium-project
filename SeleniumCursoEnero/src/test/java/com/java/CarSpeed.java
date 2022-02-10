package com.java;

public class CarSpeed {

	final static int speedHighway = 100;
	final static int speedNormal = 80;
	final static int speedScholarZone = 20;

public static String speedLimit(int currentSpeed, int roadType) {
	
	String msg = null;
	
	if(roadType == 1 || roadType == 2 || roadType == 3) {
		
		
		//Highway roadType1
		if(roadType == 1 )
		{
			if (currentSpeed > speedHighway ) {
				msg = "You got a Fine!!! - Your are very fast for a highway"; // TRUE
			}else {
				msg = "Good speed limit for a highway!"; // FALSE
			}
		}
		
		//Normal roadType2
		if (roadType == 2 ) {
			if (currentSpeed > speedNormal) {
			msg ="You got a Fine!!! - Your are too fast for a normal Road"; // TRUE
			}else {
				msg = "Good speed limit for a Road!"; // FALSE
			}
		}
		
		
		//School Zone roadType3
		if (roadType == 3)
		{
			if (currentSpeed > speedScholarZone){
			msg ="You got a Fine!!! - Dangerous speed for a Scholar Zone "; // TRUE
			}else {
			msg= "Good speed limit for a ScholarZone! " + currentSpeed; // FALSE
			}
		}
		
		
		}else {
			msg = + roadType + " Is not a valid type of Road " ;
		}
	
	
	return msg;

	}

}

