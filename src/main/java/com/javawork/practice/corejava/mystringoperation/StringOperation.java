package com.javawork.practice.corejava.mystringoperation;

public class StringOperation implements IStringOperation{
	
	public String fullName(String firstName ,String lastName) {
	
	 String fullName = (firstName+lastName);
	 System.out.println(firstName);
	 System.out.println(lastName);
	 return fullName;
	}
	public char[] letter(char[] alp) {
		
		char[] letter = alp;
		return letter;
		
	}


}
