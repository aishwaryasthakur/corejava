package com.training;

public class Application {
	
	public static void main(String [] args)
	{
		//Object Creation using parameterized constructor
		BloodDonor bd = new BloodDonor("Aishwarya", 22, "A+");
		System.out.println(bd.getName() + " " + bd.getAge() + " " + bd.getBloodGroup());
		
		//Setter method application
		bd.setAge(23);
		//Getter method application
		System.out.println(bd.getName() + " " + bd.getAge() + " " + bd.getBloodGroup());
		
		int k=0, m=-1;
		
		if(k!=0 && m!=0)
			System.out.println("A");
		else
			System.out.println("B");
	}

}
