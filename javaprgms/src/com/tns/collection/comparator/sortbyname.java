package com.tns.collection.comparator;
import java.util.Comparator;
public class sortbyname implements Comparator<student>{
	
	public int compare(student a,student b)
	{
		return a.name.compareTo(b.name);
	}
}
