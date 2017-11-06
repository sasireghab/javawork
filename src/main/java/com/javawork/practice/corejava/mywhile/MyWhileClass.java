package com.javawork.practice.corejava.mywhile;

public class MyWhileClass implements IMyWhileClass{
	
	public int i(int i) {
		System.out.println("CURRENT I VALUE IS :: "+i);
		while(i <= 10)
		{
			System.out.println("WHILE LOOP :: "+i);
			i+=2;
		}
		return i;
		
	public int k(int i) {
		int k = 0;
		System.out.println("CURRENT I VALUE IS :: "+i);
		while(i <= 30)
		{
			if(i == 20)
			{
				System.out.println("ENDING IF");
				break;
			}
			else if(i >= 20)
			{
				System.out.println("EXECUTING ELSEIF ");
				continue;
			}
			else
			{
				System.out.println("WHILE ELSE IF ::"+ i);
				i+=2;
			}
		}
		return k;

	}
		
	}

}
