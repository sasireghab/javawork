package com.javawork.practice.corejava.mysuper;

public class MySubClass extends MySuperClass {
	
	int a = 100;
	
	public MySubClass()
	{
		System.out.println("Executing MySubClass::: ");
	}
	
	public MySubClass(String name)
	{
		super("Hi");
		System.out.println("Executing MySubClass::: "+super.a);
		System.out.println("Executing MySubClass::: "+this.a);
		//super.show();
		
	}
	
	public void callShow()
	{
		System.out.println("Executing callShow::: ");
		super.show();
	}

}

	