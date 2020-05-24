package org.hacker.easy.main;

import java.util.HashMap;
import java.util.Map;

public class TestHackerLoadArguments {
	
	
 
 
}

class Add {
    public void add(int... intArgs) {
        int sum = 0;
        String separator = "";
        for (int i : intArgs) {
            sum += i;
            System.out.print(separator + i);
            separator = "+";            
        }
        System.out.println("=" + sum);
        
        Map<String,Integer> map = new HashMap<String,Integer>();
        
    }
}