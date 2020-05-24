package org.hacker.easy.main;

import java.util.ArrayList;
import java.util.Scanner;

public class TestFindPositionAndLine {
	
	
	  public static void main(String[] args) {
		  int ii = 010;
			int jj = 07;
		    System.out.println(ii +" "+jj);

		    
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int d,q,x,y;
	       
	       ArrayList[] set = new ArrayList[n];
	       
	       for(int i = 0; i<n; i++){
	           d = scan.nextInt();
	           set[i] = new ArrayList();

	           for(int j = 0; j <d; j++){
	               set[i].add(scan.nextInt());
	           }
	       }

	    q=scan.nextInt();
	    for(int i=0;i<q;i++){
	        x=scan.nextInt();
	        y=scan.nextInt();
	        try{
	            System.out.println(set[x-1].get(y-1));
	        } catch(Exception e){
	            System.out.println("ERROR!");
	        }
	    }
	   
	    }
}
