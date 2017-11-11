package com.javawork.practice.corejava.myequals;

public class MyEqualsClient {

	public static void main(String[] args) {
		MyEqualsClass meq = new MyEqualsClass();
		meq.display(1000);
		
		MyEqualsClass meq1 = new MyEqualsClass();
		meq1.display(100);
		
		System.out.println("meq : "+meq.hashCode());
		
		System.out.println("meq1 : "+meq1.hashCode());
		
		if(meq1.equals(meq)) {
			System.out.println("Objects are equal");
		}else {
			System.out.println("Objects are not equal");
		}

	}

}
