package com.jdbc.test;

public class Student {
	private int roll;
	private int cls;
	private String name;
	private String city;
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", cls=" + cls + ", name=" + name + ", city=" + city + "]";
	}
	
	public Student(int roll, int cls, String name, String city) {
		super();
		this.roll = roll;
		this.cls = cls;
		this.name = name;
		this.city = city;
	}
	public Student() {}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getCls() {
		return cls;
	}
	public void setCls(int cls) {
		this.cls = cls;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
