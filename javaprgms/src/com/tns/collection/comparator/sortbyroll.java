package com.tns.collection.comparator;
import java.util.Comparator;
public class sortbyroll implements Comparator<student>{
public int compare(student a,student b)
{
	return b.rollno-a.rollno;
}
}
