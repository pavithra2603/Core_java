package com.tns.collection.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Demo {
public static void main (String args[])
{
	List<Laptop>laps=new ArrayList<Laptop>();
	laps.add(new Laptop("dell",25,40000));
	laps.add(new Laptop("Hp",20,50000));
	laps.add(new Laptop("Asus",15,70000));
	Collections.sort(laps);
	for(Laptop l:laps)
	{
		System.out.println(l);
	}
}
}
