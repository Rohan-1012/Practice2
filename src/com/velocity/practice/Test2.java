package com.velocity.practice;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no");
	int num =sc.nextInt();
	
	StringBuffer rev;
	StringBuffer sb = new StringBuffer(String.valueOf(num));
	 rev =sb.reverse();
		
		System.out.println(rev);

	}

}
