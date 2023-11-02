package com.tns.constructor;
import java.util.Scanner; 

	public class constructordemo {


	public static void main(String[] args) {
		
		Scanner o=new Scanner(System.in);
		String cusname,city;
		int id;
		System.out.println("enter customer id:");
		id=o.nextInt();
		o.nextLine();
		System.out.println("enter customer name:");
		cusname=o.next();
		System.out.println("enter customer city:");
		city=o.next();
		customer c1=new customer();
	    c1.setName(cusname);
		c1.setCustomerid(id);
		c1.setCustomercity(city);
		System.out.println(c1);
	}

	
	}
	
	
		
	


