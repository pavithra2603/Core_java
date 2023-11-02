package com.tns.threadprgms;

public class Implementingrunnable implements Runnable{

	public void run()
	{
		System.out.println("implementing runnable");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Implementingrunnable t=new Implementingrunnable();
Thread t1=new Thread(t);
t1.start();
		
		
	}

}
