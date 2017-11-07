package com.javawork.practice.corejava.myinheritance;

public class MyChildClass extends MyParentClass{

	public void result()
	{
		String name1 = super.name( "REGHA", "SENTHIL");
		int sum1 = super.sum(10,20);
		System.out.println("PRINT NAME :: "+name1);
		System.out.println("PRINT SUM :: "+sum1);
		System.out.println(super.value);
	}
	public int cal(int a,int b)
	{
		int c = a%b;
		System.out.println(" A VALUE IS ::"+a);
		System.out.println(" B VALUE IS ::"+b);
		System.out.println(" MOD VALUE IS ::"+c);
		return c;
	}
}
