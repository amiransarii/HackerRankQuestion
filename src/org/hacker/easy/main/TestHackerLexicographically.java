package org.hacker.easy.main;


public class TestHackerLexicographically {
	
	public static void main(String args[]) {
		
		//getArr("welcometojava", 3);
		
		getArrList("welcometojava", 3);
		
		/*System.out.println(received);
		
		System.out.println(received.get(0));
		System.out.println(received.get(received.size() -1)); */
	}

	 
	
	
	static void getArrList (String str,int k) {
		String smallest = "yeyeeeeeeeeeyeyyeyeyeyey";
        String largest = "";
	 	
		for(int i = 0; i < str.length(); i++) {
			
			int index = 0;
			String strs ="";
			while(index < k && index <str.length()) {
				 if(i+index < str.length()) {
						strs += str.charAt(i+index);
				 }
				index++;
			}
			if(strs.length() == k) {
				
				 if(strs.compareTo(smallest) <0) {
					 smallest = strs;
				 }
				 
				 if(strs.compareTo(largest) >0) {
					 largest = strs;
				 }
				
				//listChar.add(strs);
			}
			
		}
	 
		System.out.println("Smallest "+smallest +" largest "+largest);
		
	}
}
