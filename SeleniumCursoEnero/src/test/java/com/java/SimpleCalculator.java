/**
 * 
 */
package com.java;

/**
 * @author apo11
 *
 */
public class SimpleCalculator {

	/**
	 * 
	 */
	
	double firstNumber; double secondNumber;
	
	public SimpleCalculator() {
		// TODO Auto-generated constructor stub
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double getAdditionResult()
	{
		return getFirstNumber() + getSecondNumber();
		
	}
	public double getSubtractionResult()
	{
		return getFirstNumber() - getSecondNumber();
	}
	public double getMultiplicationResult()
	{
		return getFirstNumber() * getSecondNumber();
	}
	public double getDivisionResult()
	{
		if( getSecondNumber()==0){ 
			return 0;
		
		}else {
		return getFirstNumber() / getSecondNumber();
		}
	}
	
	
	

}
