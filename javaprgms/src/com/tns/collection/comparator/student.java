package com.tns.collection.comparator;

public class student {
int rollno;
String name,address;

public student(int rollno,String name,String address)
{
	super();
	this.rollno=rollno;
	this.name=name;
	this.address=address;
}

@Override
public String toString() {
	return "student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
}
}