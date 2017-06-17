package main.java.com.chen.generic;

import java.util.Random;

public class Normal {
	public static void main(String[] args) {

		Random random = new Random();
		for (int a = 0; a < 20; a++) {
			Integer integer = random.nextInt(10);
			if (integer == 0) {
				System.err.println(integer);
			} else {
				System.out.println(integer);
			}
		}
	}
}
