package com.tns.lambdaprrgms;

public class withparameterdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cube c=(a)->{return(a*a*a);};
System.out.println("cube of a number:"+c.calculate(3));
square s =(a)->{return(a*a);};
System.out.println("square of a number:"+s.calculate(23));
	}

}
