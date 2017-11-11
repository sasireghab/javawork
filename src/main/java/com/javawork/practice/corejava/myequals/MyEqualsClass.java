package com.javawork.practice.corejava.myequals;

public class MyEqualsClass {
	
	private int a;
	
	public void display(int a)
	{
		this.a = a;
		System.out.println("Give number is "+a);
	}

	@Override
	public int hashCode() {
		return a;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyEqualsClass other = (MyEqualsClass) obj;
		if (a != other.a)
			return false;
		return true;
	}
	
	
	
	
	
	

}
