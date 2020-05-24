package org.hacker.easy.main;



public class TestHackerAnargam {
	
	public static void main(String args[]) {
		boolean result = isAnagram("hello", "Hello");
		System.out.println(result);
		
	}
	
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.trim().toLowerCase(); //convert all characters in small letter
        b = b.trim().toLowerCase(); //convert all characters in small letter

       char[] aa = a.toCharArray(); // convert a string into array
       char[] bb = b.toCharArray(); // convert b string into array
        
       java.util.Arrays.sort(aa); //sort array a
       java.util. Arrays.sort(bb); //sort array b
        boolean result = false;

        if(aa.length != bb.length){
          result = false;
        }
        else{
            result =  java.util.Arrays.equals(aa,bb);
        }
       return result;
    }

}
