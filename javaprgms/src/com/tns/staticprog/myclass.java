package com.tns.staticprog;

public class myclass {
private int section;
private static int srno;
static {
	System.out.println("static block");
	srno=1000;
}
myclass()
{
	System.out.println("default constructor");
	section++;
	srno++;
}
	static void display()
	{
		System.out.println("serial no"+srno);
		
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "myclass [section=" + section + "]";
	}
	
	
}
