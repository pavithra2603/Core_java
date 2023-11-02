package com.tns.threadprgms;

public class Extendingthread extends Thread{
	public void run()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Extendingthread t=new Extendingthread();
t.start();
System.out.println(t.getName());
System.out.println(t.getPriority());
		
		
	}

}
