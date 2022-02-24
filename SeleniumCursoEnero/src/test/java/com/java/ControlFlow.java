package com.java;

public class ControlFlow {
	

	static int numBuckets; // number of buckets that Bob needs to buy before going to work.
	
	/*
	 * The first parameter should be named width of type double. 
		This parameter represents the width of the wall.
		
		The second parameter should be named height of type double. This parameter represents the height of the wall.
		
		The third parameter should be named areaPerBucket. This parameter represents the area that can be covered with one bucket of paint.
		
		The fourth parameter should be named extraBuckets. This parameter represents the bucket count that Bob has at home.
	 * */
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
	{
		double area =0.0;
		double parts = 0.0;
		double areaExtraBuckets=0.0;
		//		If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs 
		//		to return -1 to indicate an invalid value.

		if(width <=0 || height <=0 || areaPerBucket<=0) {
			return -1;
			
		}else {
				 area = width*height;
				 parts = area/areaPerBucket;
				 areaExtraBuckets = areaPerBucket * extraBuckets;
				return numBuckets =  (int) Math.ceil((area-areaExtraBuckets)/areaPerBucket);
				 
		}
	
		
	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket)
	{
		double area =0.0;
		double parts = 0.0;
		
		//		If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs 
		//		to return -1 to indicate an invalid value.

		if(width <=0 || height <=0 || areaPerBucket<=0) {
			return -1;
			
		}else {
				 area = width*height;
				 parts = area/areaPerBucket;
				// areaExtraBuckets = areaPerBucket * extraBuckets;
				return numBuckets =  (int) Math.ceil(area/areaPerBucket);
				 
		}
	
		
	}
	
	public static int getBucketCount(double area, double areaPerBucket)
	{
		
				
		//		If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs 
		//		to return -1 to indicate an invalid value.

		if(area <=0 || areaPerBucket<=0) {
			return -1;
			
		}else {
				 
				return numBuckets =  (int) Math.ceil(area/areaPerBucket);
				 
		}
	
		
	}
	
	
}
