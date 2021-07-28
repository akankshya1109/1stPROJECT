package com.lti.demo;

public class Person {
private int perId;
private String perName;
private double Salary;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(int perId, String perName, double salary) {
	super();
	this.perId = perId;
	this.perName = perName;
	Salary = salary;
}
public int getPerId() {
	return perId;
}
public void setPerId(int perId) {
	this.perId = perId;
}
public String getPerName() {
	return perName;
}
public void setPerName(String perName) {
	this.perName = perName;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
@Override
public String toString() {
	return "Person [perId=" + perId + ", perName=" + perName + ", Salary=" + Salary + "]";
}

}
