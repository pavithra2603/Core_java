package com.tns.abstraction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square s=new Square();
Rectangle r=new Rectangle();   
System.out.println(s);
System.out.println(r);
	Shape sh;
sh=new Square(4.0f);
sh.calcArea();
sh.show();
sh=new Rectangle(4.0f,5.0f);
sh.calcArea();
sh.show();
}
}