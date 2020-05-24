package org.hacker.easy.main;

import java.util.Scanner;

public class TestHackerSpacing2 {
	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int x=sc.nextInt();
             
             if(s1.length() > 10) {
            	 throw new IllegalArgumentException("Invalid String");
             }
             
             if(x <0 || x > 999) {
            	 throw new IllegalArgumentException("Invalid Integer");
             }
             
              String xx = String.valueOf(x);
              
              if(xx.length() <3) {
            	  
            	  if(xx.length() ==1) {
            		  xx = "00"+xx.trim();
            	  }
            	  else if(xx.length() ==2) {
            		  xx ="0"+xx.trim();
            	  }          	  
              }
              System.out.println( String.format("%0$-15s", s1) + xx.trim());
              //System.out.println(s1.trim() + String.format("%0$15s",xx.trim()));
             

             
         }
         System.out.println("================================");

 }

}
