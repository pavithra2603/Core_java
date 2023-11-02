package com.tns.calci;
import java.util.Scanner;
public class circlearea {

	public static void main(String[] args) {
		float radius;
		String color;
	    Scanner sc = new Scanner(System.in);
			System.out.println("enter radius:");
			radius=sc.nextFloat();
			System.out.println("enter color:");
			color=sc.next();
			double area=3.14*radius*radius;
			circle c1=new circle();
		    c1.setRadius(radius);
			c1.setColor(color);
			c1.setArea(area);
			System.out.println(c1);
	}

}
