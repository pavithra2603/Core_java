package com.tns.abstraction;

public abstract class Shape {
protected float area;
abstract void calcArea();//abstract method
//concrete method

	void show()
	{
		System.out.println("area of shape is:"+area);
	}
	
	
}
