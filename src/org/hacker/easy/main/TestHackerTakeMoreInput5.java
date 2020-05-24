package org.hacker.easy.main;

import java.util.Scanner;

public class TestHackerTakeMoreInput5 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		String str ="";
		 int index = 1;
		while(scan.hasNext()) {
			str  = scan.next();
			str += scan.nextLine();
			System.out.println(index +" "+str);
			index++;		
		}
		
	}

}
