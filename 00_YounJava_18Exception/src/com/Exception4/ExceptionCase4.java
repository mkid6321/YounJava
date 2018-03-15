package com.Exception4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase4 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.println("a/b...a?");
			int n1 = kb.nextInt();
			System.out.println("a/b...b?");
			int n2 = kb.nextInt();
			System.out.printf("%d / %d = %d\n",n1,n2,n1 / n2);
		} catch (InputMismatchException | ArithmeticException e) {
			e.getMessage();
			e.printStackTrace();
		}
		System.out.println("Good bye~~~!");
	}
}
