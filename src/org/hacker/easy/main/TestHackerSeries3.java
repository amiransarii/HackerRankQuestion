package org.hacker.easy.main;

import java.util.Scanner;

public class TestHackerSeries3 {

	// series question

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int index = 1;
			int sum = 0;
			while (index <= n) {
				sum = 0;
				for (int k = 0; k < index; k++) {
					if(k == 0) {
						sum  = a + (int) Math.pow(2, 0) * b;	
					}
					else {
						sum +=  (int) Math.pow(2, k) * b;
					}
									
				}
				System.out.print(sum +" ");
				index++;
			}
			System.out.println();
			
		}

	}

}
