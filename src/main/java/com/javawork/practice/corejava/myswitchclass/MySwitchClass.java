package com.javawork.practice.corejava.myswitchclass;

public class MySwitchClass implements IMySwitchClass{
	
	/*public void calgrade(int mark) {
	switch(mark)
	{
		case 40:
		System.out.println("GRADE C");
		break;
		
		case 60:
		System.out.println("GRADE B");
		break;
		
		case 80:
		System.out.println("GRADE A");
		break;
		
		default:
		System.out.println("NO MATCHING CASE");
		break;
	}
	}*/

	public String cal(int mark,char grade) {
		String cal = null;
	switch(grade)
	{
		case 'A':
		if(mark > 80)
		{
			System.out.println("GRADE A+");
		}
		else if(mark == 80)
		{
			System.out.println("GRADE A");
		}
		break;
		
		case 'B':
		System.out.println("GRADE B");
		break;
		
		default:
		System.out.println("NO GRAGE FOR IF CONDITION");
		break;
		
	}
	return cal;
	}
	
}


