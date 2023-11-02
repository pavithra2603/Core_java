package com.tns.calci;

import java.util.Scanner;


 public class salesamt {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name,address;
		System.out.println("enter name:");
		name=s.next();
		System.out.println("enter address:");
		address=s.next();
		System.out.println("enter phonenumber:");
		int phone=s.nextInt();
		System.out.println("enter salesamount:");
		int saleamount=s.nextInt();
		commission p=new commission();
		p.setName(name);
		p.setAddress(address);
		p.setPhone(phone);
		p.setSalesamount(saleamount);
        commissioncalc cal=new commissioncalc();
		cal.Calculatecomm(p);
		System.out.println("calculating commission");
		System.out.println(p);
	
	}

}
