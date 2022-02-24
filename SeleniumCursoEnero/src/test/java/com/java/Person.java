/**
 * 
 */
package com.java;

/**
 * @author apo11
 *
 */


public class Person {

	/**
	 * names firstName, lastName of type String and age of type int. 
	 */
	
	String firstName;
	String lastName;
	int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isTeen()
	{
		//it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
		if(getAge() >= 12 && getAge() < 20) {
			
			return true;
		
		}else {
		
			return false; }	
	}
	
	public String getFullName()
	{
		if (getFirstName().isEmpty() && !getLastName().isEmpty()) {
			return getLastName();
		}
		if (!getFirstName().isEmpty() && getLastName().isEmpty()) {
			return getFirstName();
		}
		if (!getFirstName().isEmpty() && !getLastName().isEmpty()) {
			return (getFirstName() + " "+ getLastName());
		}else
		{
		
			return (getFirstName() + "  "+ getLastName());
		}
	}
	

}
