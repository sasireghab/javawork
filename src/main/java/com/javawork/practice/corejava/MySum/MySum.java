package com.javawork.practice.corejava.MySum;

public class MySum implements ISum{
	
	public int sum(int a,int b)
	{
		int c = a+b;
		System.out.println("Sum INPUT A ::"+a);
		System.out.println("Sum INPUT B ::"+b);
		return c;
	}

}
