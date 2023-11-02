package com.tns.exception;

import java.io.IOException;

public class Throwsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Throws ob=new Throws();
try
{
	ob.display();
}
catch(IOException e)
{
	System.out.println("caught exception" + e.getMessage());
}
	}

}
