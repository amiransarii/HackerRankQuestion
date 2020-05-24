package org.hacker.easy.main;



public class TestHackerStringPalindrome {
	
	public static void main(String args[]) {
		
		String A ="madam";
		int length =A.length();
		String revStr ="";
		
		int[] aa = {1,2};
		int[] bb = {3,4};
		
		
		for(int i = length -1;i>=0; i--){
            revStr+= A.charAt(i);
        }
         if(A.equals(revStr)){
             System.out.println("Yes");
         }
         else{
              System.out.println("No");
         }

	}

}
