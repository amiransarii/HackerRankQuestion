package org.hacker.easy.main;

import java.util.Scanner;

public class TestHackerStaticBlock6 {
	
	private static boolean flag = false;
	private static int B;
	private static int H;
	
	static {
	
		 Scanner sc= new Scanner(System.in);
		  
		 B = sc.nextInt();
		 H = sc.nextInt();
		 
		 if(B > 0 && H >0) {
			 flag = true;
		 }
		 else {
			 System.out.println("java.lang.Exception: Breadth and height must be positive");
		 }
		 
		
	}
	
	
	public static void main(String[] args){
		System.out.println("Main block executed");
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main



}//end of class
