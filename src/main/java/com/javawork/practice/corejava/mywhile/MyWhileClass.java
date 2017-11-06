package com.javawork.practice.corejava.mywhile;

public class MyWhileClass implements IMyWhileClass{
	
	/*public int i(int i) {
		System.out.println("CURRENT I VALUE IS :: "+i);
		while(i <= 10)
		{
			System.out.println("WHILE LOOP :: "+i);
			i+=2;
		}
		return i;
	*/
	public void k(int j) {
		System.out.println("CURRENT I VALUE IS :: "+j);
		while(j <= 30)
		{
			if(j == 20)
			{
				System.out.println("ENDING IF");
				break;
			}
			else if(j >= 30)
			{
				System.out.println("EXECUTING ELSEIF ");
				continue;
			}
			else
			{
				System.out.println("WHILE ELSE IF ::"+ j);
				j+=2;
			}
		}

	}
		
	}


