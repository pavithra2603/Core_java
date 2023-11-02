package com.tns.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<student>ar=new ArrayList<student>();
ar.add(new student(21,"bb","london"));
ar.add(new student(30,"cc","US"));
ar.add(new student(23,"abc","canada"));
for(int i=0;i<ar.size();i++)
System.out.println(ar.get(i));
System.out.println("--------");
Collections.sort(ar,new sortbyroll());
for(int i=0;i<ar.size();i++)
System.out.println(ar.get(i));	
System.out.println("--------");
Collections.sort(ar,new sortbyname());
for(int i=0;i<ar.size();i++)
System.out.println(ar.get(i));	
			
		
		
	}

}
