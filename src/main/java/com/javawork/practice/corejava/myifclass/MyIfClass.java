package com.javawork.practice.corejava.myifclass;

public class MyIfClass implements IMyIfClass{
	
	/*int a = 30;
	int b = 10;
	int e = a+b;
	int f = a-b;
	int c = 40;
	int d = 20;
	int g = 10;
	int h = 30;
	String name = "senthil";
	String name1 = "senthil";
	String name2 = "reghasenthil";
	if(a<b)
	{
		System.out.println("A VALUE IS BIGGER THAN B VALUE");
	}
	else
	{
		System.out.println("B VALUE IS BIGGER THAN B VALUE");
	}
	if(a==h && b==g)
	{
		System.out.println("AB VALUE AND GH VALUE ARE SAME");
	}	
	if(a!=h || b==g)
	{
		System.out.println("AB VALUE AND GH VALUE ARE SAME");
	}
	if(e==c && f==b)
	{
		System.out.println("EF VALUE AND CD VALUE NOT EQUAL");
	}
	else if(e==c && d==f)
	{
		System.out.println("EF VALUE AND CD VALUE ARE EQUAL");
	}*/
	public void compare(String name,String name1, String name2) {
	if(name == name1 && name != name2)
	{
		System.out.println("PRINT NAME :: "+name);
	}
	else
	{
		System.out.println("PRINT NAME :: "+name2);
	}
	}
}
