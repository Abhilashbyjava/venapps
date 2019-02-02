package com.app;

import java.util.Scanner;

public class Hello {

	public void printnums() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = sc.nextInt();
		if (num1 > 0) {
			System.out.println("given no is positive");

		} else {
			System.out.println("given no is negitive");
		}

	}

	public static void main(String[] args) {
		Hello h=new Hello();
		h.printnums();
	}
}
