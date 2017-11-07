package com.javawork.practice.corejava.myencapsulation;

public class MyEncapsulationClass {
	
	private int empId;
	private String empName;
	private int grosssalary;
	private int tax;
	private int netsalary;
	
	public int getempId()
	{
		System.out.println("PRINT EMP.ID :: "+empId);
		return this.empId;
	}
	public String getempName()
	{
		System.out.println("PRINT EMP.NAME :: "+empName);
		return this.empName;
	}
	public int getsalary()
	{
		System.out.println("PRINT EMP.SALARY :: "+grosssalary);
		return this.grosssalary;
	}
	
	public void setEmp(int empId,String empName,int salary)
	{
		this.empId = empId;
		this.empName = empName;
		this.grosssalary = salary;
	}
	
	
	public int calculate()
	{
		tax = grosssalary*10/100;
		this.netsalary = grosssalary-tax;
		int finalsalary = this.netsalary;
		System.out.println("PRINT TAX AMOUNT ::  "+tax);
		System.out.println("PRINT NETSALARY AMOUNT :: "+finalsalary);
		return finalsalary;
	}
	public void calculate1()
	{
		tax = grosssalary*20/100;
		this.netsalary = grosssalary-tax;
		System.out.println("PRINT TAX AMOUNT ::  "+tax);
		System.out.println("PRINT NETSALARY AMOUNT :: "+this.netsalary);
	}

}
