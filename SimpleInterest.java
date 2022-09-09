package com.lulu.assessment;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int P = sc.nextInt();
		System.out.println("Enter the time in years");
		int T = sc.nextInt();
		System.out.println("Enter the rate of interest in percentage");
		int R = sc.nextInt();
		int SI;
		SI = (P * T * R) / 100;
		System.out.println("The Simple Interest is " + SI);
		int totalamount = SI + P;
		System.out.println("The total amount to be paid after loan duration ends is " + totalamount);

	}

}
