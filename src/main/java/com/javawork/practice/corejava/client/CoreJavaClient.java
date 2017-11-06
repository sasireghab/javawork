package com.javawork.practice.corejava.client;

import com.javawork.practice.corejava.MySwap.ISwap;
import com.javawork.practice.corejava.MyWordPrint.IWordPrint;
import com.javawork.practice.corejava.MyWordPrint.MyWordPrint;

public class CoreJavaClient {

	public static void main(String[] args) {
		System.out.println("EXECUTING CORE JAVA CLIENT");
		/*IWordPrint wp = new MyWordPrint()
		{
			String word = wp.print("HELLO");
			String word1 = wp.print1("Alexandra Abramov");
		
		}*/
		
		ISwap swap = new MySwap()
		{
			int a = swap.bswap(10);
			int b = swap.bswap1(20);
			//System.out.println("VALUE BEFORE SWAP ");
			System.out.println("A ::"+a);
			System.out.println("B ::"+b);
			int a = swap.bswap(a+b);
			int b = swap.bswap1(a-b);		
			System.out.println("VALUE AFTER SWAP ");
			System.out.println("A ::"+a);
			System.out.println("B ::"+b);
		}
	}

}
