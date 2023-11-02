package com.tns.exception;
import java.util.Scanner;
public class Testdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no:");
		int rollno=sc.nextInt();
		if(rollno<0)
		{
			throw new ArithmeticException("roll no cannat be negative");
			}
		else
			System.out.println("valid roll no");
	}

}
