package com.jdbc.test1;

public class EmployeeDAO {
	private int empID;
	private String name;
	private double salary;
	private String city;
	private int age;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public EmployeeDAO(int empID, String name, double salary, String city, int age) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.age = age;
	}
	
	
}
