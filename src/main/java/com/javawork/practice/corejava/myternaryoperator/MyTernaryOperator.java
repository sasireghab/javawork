package com.javawork.practice.corejava.myternaryoperator;

public class MyTernaryOperator implements ITernaryOperator{
	
	public String value(int a, int b) {

		String value = (a > b) ? "pass" : "fail";
		return value;
		
	}
	public int mark(char grade,char grade1) {
		
		int mark = (grade != grade1) ? 80 : 60;
		return mark;
		
	}

}
