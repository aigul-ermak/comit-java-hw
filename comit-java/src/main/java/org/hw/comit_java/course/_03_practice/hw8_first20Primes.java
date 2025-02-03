package org.hw.comit_java.course._03_practice;

public class hw8_first20Primes {
	public static void main(String[] args) {
		int count = 0; // Count of prime numbers found
		int num = 2; // Starting number to check

		System.out.println("First 20 prime numbers:");

		while (count < 20) {
			boolean isPrime = true;

			if (num < 2) {
				isPrime = false;
			} else {
				for (int i = 2; i * i <= num; i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
			}

			if (isPrime) {
				System.out.print(num + " ");
				count++; // Increment count when a prime is found
			}

			num++; // Move to the next number
		}
	}
}
