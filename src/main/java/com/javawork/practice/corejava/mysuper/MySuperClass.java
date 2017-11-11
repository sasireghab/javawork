package com.javawork.practice.corejava.mysuper;

public class MySuperClass {
	
	

	int a = 20;
	public MySuperClass()
	{
		System.out.println("Executing MySuperClass Constructor ");	
	}
	
	public MySuperClass(String name) {
		System.out.println("Executing MySuperClass Constructor ::"+name);
	}
	
	
	void show() {
		System.out.println("Executing show method ......");
	}
}
