package com.tns.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {
	public static void main(String[] args)
	{
		ArrayList list1=new ArrayList();
		System.out.println("check the list is empty or not " + list1.isEmpty());
		list1.add(20);
		list1.add('a');
		list1.add(22.5);
		System.out.println("size of arraylist "+ list1.size());
		System.out.println(list1);
		System.out.println(list1.contains(55));
		System.out.println(list1.remove(1));
		System.out.println("element at the position "+list1.get(1));
		System.out.println("removing the element "+ list1.remove(1));
		System.out.println(list1);
		ArrayList<String>ob=new ArrayList<String>();
		ob.add("pavi");
		ob.add("abi");
		ob.add("nivi");
		//traverse a list
		Iterator<String>i=ob.iterator();
		while(i.hasNext())
		{
			String nm=i.next();
			System.out.println(nm);
			
		}
	}

}
