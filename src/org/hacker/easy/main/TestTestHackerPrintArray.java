package org.hacker.easy.main;

import java.util.Scanner;

public class TestTestHackerPrintArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i< n; i++)
        arr[i] = sc.nextInt();

        int size = arr.length;
        int noOfArray = 0;
        
        for(int i = 0; i < size; i++) {
            int sum = 0;
            for(int j = i; j < size; j++) {
                
                sum += arr[j];
                
                if(sum <0) {
                    noOfArray++;
                }
                
            }
            
        }
         System.out.println(noOfArray);


    }
}