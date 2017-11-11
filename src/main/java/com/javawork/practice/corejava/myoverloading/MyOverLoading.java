package com.javawork.practice.corejava.myoverloading;

public class MyOverLoading {
	private int salary;
	private int tax;
	private int netsalary;
	private String name;
	private int id;
	private String email;
	public void display(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println("ID ::"+id);
		System.out.println("NAME ::"+name);
		System.out.println("SALARY ::"+salary);
	}
	public void display(int id,String name,int salary,String email)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.email=email;
		System.out.println("ID ::"+id);
		System.out.println("NAME ::"+name);
		System.out.println("SALARY ::"+salary);
		System.out.println("EMAIL :: "+email);
	}
	public void display(int tax,int netsalary)
	{
		this.tax=tax;
		this.netsalary=netsalary;
		System.out.println("TAX :: "+tax);
		System.out.println("NETSALARY :: "+netsalary);
	}

}
