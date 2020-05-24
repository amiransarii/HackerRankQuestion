package org.hacker.easy.main;

public class TestHackerUserRankPattern {
	// public static final String regularExpression = "([a-zA-Z])(\\w){7,29}";
	
	 public static void main(String args[]) {
		 
		 String str ="amir";
			String str2 ="akil";
			
			str = str.substring(0, 1).toUpperCase() + str.substring(1);
			System.out.println(str);
			
			str.compareTo(str);
			
			 int res =(str.compareTo(str2)) ;
			 
			String lex = (str.compareTo(str2)>0)? "Yes": "No";
					
		 
	 }

}
