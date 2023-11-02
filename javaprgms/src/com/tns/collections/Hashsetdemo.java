package com.tns.collections;
import java.util.HashSet;
public class Hashsetdemo {
static void addElements(HashSet<Integer> numberHashset)
{
	numberHashset.add(40);
	numberHashset.add(26);
	numberHashset.add(55);
	numberHashset.add(33);
	numberHashset.add(29);
	System.out.println(numberHashset.add(55));
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer>numberHashset=new HashSet<Integer>();
addElements(numberHashset);
HashSet<Integer>numberHashset1=new HashSet<Integer>();
numberHashset1.add(11);
numberHashset1.add(26);
numberHashset1.add(29);
numberHashset1.add(49);
System.out.println(numberHashset);
System.out.println(numberHashset1);
//union of two sets
numberHashset.addAll(numberHashset1);
System.out.println("resultset:"+numberHashset);
numberHashset1.clear();
System.out.println("resultset:"+numberHashset);
//intersection of two sets
numberHashset.retainAll(numberHashset1);
System.out.println("resultset:"+numberHashset);
//set difference between two sets
numberHashset1.removeAll(numberHashset1);
System.out.println("resultset:"+numberHashset1);
}
}
