package com.tns.collections;
import java.util.ArrayList;
public class Generics {
public static void main(String args[]) {
	ArrayList <String> l=new ArrayList<String>();
	l.add("hello");
	for(String str:l) {
	System.out.println(str);	
	}
}
}
