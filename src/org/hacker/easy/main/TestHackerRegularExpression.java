package org.hacker.easy.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestHackerRegularExpression {
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        if(!scan.hasNext())
	         {
	        System.out.print("0");
	        return; 
	        }
	        String s = scan.nextLine();
	        // Write your code here.
	      String[] items = s.trim().split("[ !,?.\\_'@]+");
	        if(s ==" "){
	           System.out.println("0");
	        }
	        else if(s.length() > 400000){
	            return;
	        }
	        else{
	           System.out.println(items.length);
	        }
	        
	        for(int i = 0 ; i < items.length ; i++) {
	            System.out.println(items[i]);
	        }     
	        scan.close();
	    }

}
