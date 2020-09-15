package com.training;

public class BloodDonor {
	
	private String name;
	private int age;
	private String bloodGroup;
	
	public BloodDonor(String name, int age, String bloodGroup) {
		super();
		this.name = name;
		this.age = age;
		this.bloodGroup = bloodGroup;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
}
