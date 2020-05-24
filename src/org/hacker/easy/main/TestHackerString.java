package org.hacker.easy.main;

import java.util.Scanner;

public class TestHackerString {
	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */

	        int lengthA = A.length();
	        int lengthB = B.length();
	        
	        int sumLength = lengthA + lengthB; // sum of length  
	        String lex = (A.compareTo(B)>0)? "Yes": "No";
	        String ACap = A.substring(0, 1).toUpperCase() + A.substring(1);
	        String BCap = B.substring(0, 1).toUpperCase() + B.substring(1);

	        System.out.println(sumLength);
	        System.out.println(lex);
	        System.out.println(ACap +" "+BCap);

	           

	        
	    }
}
