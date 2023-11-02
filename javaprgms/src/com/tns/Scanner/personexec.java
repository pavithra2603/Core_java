package com.tns.Scanner;

import java.util.Scanner;

public class personexec {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String name;
	System.out.println("enter name:");
	name=s.next();
	System.out.println("enter income:");
	int income=s.nextInt();
	person pp=new person();
	pp.setName(name);
	pp.setIncome(income);
	Taxcalculation cal=new Taxcalculation();
	cal.calculateTax(pp);
	System.out.println("calculating tax");
	System.out.println(pp);
	
	
	}

}
