package org.hacker.easy.main;

import java.math.BigInteger;
import java.util.Scanner;

public class TestHackerPrime {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = scanner.nextBigInteger();
        scanner.close();
         System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
    }
}
