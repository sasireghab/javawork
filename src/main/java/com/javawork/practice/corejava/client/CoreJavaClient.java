package com.javawork.practice.corejava.client;

import com.javawork.practice.corejava.myifclass.IMyIfClass;
import com.javawork.practice.corejava.myifclass.MyIfClass;
import com.javawork.practice.corejava.mypattern.IPattern;
import com.javawork.practice.corejava.mypattern.Pattern;
import com.javawork.practice.corejava.mystringoperation.IStringOperation;
import com.javawork.practice.corejava.mystringoperation.StringOperation;
import com.javawork.practice.corejava.mysum.ISum;
import com.javawork.practice.corejava.mysum.MySum;
import com.javawork.practice.corejava.myswap.ISwap;
import com.javawork.practice.corejava.myswap.MySwap;
import com.javawork.practice.corejava.myswitchclass.IMySwitchClass;
import com.javawork.practice.corejava.myswitchclass.MySwitchClass;
import com.javawork.practice.corejava.myternaryoperator.ITernaryOperator;
import com.javawork.practice.corejava.myternaryoperator.MyTernaryOperator;
import com.javawork.practice.corejava.mytwodimarraydemo.ITwoDimArray;
import com.javawork.practice.corejava.mytwodimarraydemo.MyTwoDimArray;
import com.javawork.practice.corejava.mywhile.IMyWhileClass;
import com.javawork.practice.corejava.mywhile.MyWhileClass;
import com.javawork.practice.corejava.mywordprint.IWordPrint;
import com.javawork.practice.corejava.mywordprint.MyWordPrint;

public class CoreJavaClient {

	public static void main(String[] args) {
		System.out.println("EXECUTING CORE JAVA CLIENT");
	
	/*	IWordPrint wp = new MyWordPrint();
		
			String word = wp.print("HELLO");
			String word1 = wp.print1("Alexandra Abramov");
			System.out.println(word);
			System.out.println(word1);
		
	*/	
	/*	ISwap swap = new MySwap();
		
			int a = swap.bswap(10);
			int b = swap.bswap1(20);
			System.out.println("VALUE BEFORE SWAP ");
			System.out.println("A ::"+a);
			System.out.println("B ::"+b);
			a = swap.bswap(a+b);
			b = swap.bswap1(a-b);		
			System.out.println("VALUE AFTER SWAP ");
			System.out.println("A ::"+a);
			System.out.println("B ::"+b);
	*/
		
	/*	ISum find = new MySum(); 
			int sum = find.sum(10,20);
			System.out.println("SUM OF TWO VALUE IS ::"+sum);
	*/
		
		/*ITwoDimArray twoArray = new MyTwoDimArray();
		
			int[][] ans = twoArray.ans(
										{
											{69,75,43,55,35,87},
											{90,80,70,60,50,40}	
										};
									);
			System.out.println("Size of ans is  "+ ans.length); 
			System.out.println("*****************************************");
	        System.out.println("Marks of First Subject- "+ ans[0][0]);  
	        System.out.println("Marks of Second Subject- "+ ans[0][1]);  
	        System.out.println("Marks of Third Subject- "+ ans[0][2]);  
	        System.out.println("Marks of Fourth Subject- "+ ans[0][3]);  
	        System.out.println("Marks of Fifth Subject- "+ ans[0][4]);  
	        System.out.println("Marks of Sixth Subject- "+ ans[0][5]); 
			System.out.println("*****************************************");

			System.out.println("Marks of First Subject- "+ ans[1][0]);  
	        System.out.println("Marks of Second Subject- "+ ans[1][1]);  
	        System.out.println("Marks of Third Subject- "+ ans[1][2]);  
	        System.out.println("Marks of Fourth Subject- "+ ans[1][3]);  
	        System.out.println("Marks of Fifth Subject- "+ ans[1][4]);  
	        System.out.println("Marks of Sixth Subject- "+ ans[1][5]);  
			System.out.println("*****************************************");
	    
			
		*/
		
	/*	ITernaryOperator to = new MyTernaryOperator();
		
			int result = to.mark('A','B');
			System.out.println(result);
		
			String result1 = to.value(430 , 350);
			System.out.println(result1);
    */
		
	/*	IStringOperation so = new StringOperation();
		
			String result = so.fullName("REGHA", "SENTHIL"); 
			System.out.println(result);
			//char[] result1 = so.letter('a','b','c','d','e');
			//System.out.println(result1[3],result1[0]);
		
	
	*/
		
	/*	IPattern pat = new Pattern();
		
			String pr1 = pat.print1("   J       a   v     v    a     \");                                            \r\n" + 
			String pr2 = pat.print2("  J 	  a a   v   v    a a    \");                                             \r\n" + 
			String pr3 = pat.print3("  J J    aaaaa   V V    aaaaa   \");                                          \r\n" + 
			String pr4 = pat.print4("  JJJ   a     a   V    a     a  \");
			System.out.println(pr1);
			System.out.println(pr2);
			System.out.println(pr3);
			System.out.println(pr4);
	*/
		
	/*	IMyWhileClass mywc = new MyWhileClass();
		
			//int i= mywc.i(1);
			//System.out.println("CURRENT I VALUE IS:: "+i);
			mywc.k(5);
	*/
		
	/*	IMySwitchClass sc = new MySwitchClass();
		
			sc.calgrade(60);
	*/
	/*	IMySwitchClass sc = new MySwitchClass();
		
			sc.cal(90, 'A');
	*/
		
		IMyIfClass mif = new MyIfClass();
		
			
		
			
			
			
		}

}
	

	


	
