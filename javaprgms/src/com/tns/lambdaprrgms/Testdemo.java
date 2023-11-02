package com.tns.lambdaprrgms;
//prgm demonstrate runnable interface  using lambda expression
public class Testdemo {
public static void main(String args[])
{
	Runnable basic=()->{String threadname=Thread.currentThread().getName();
	System.out.println("thread name"+threadname);};
	
	Thread thread1=new Thread(basic);
	Thread thread2=new Thread(basic);
	thread1.start();
	thread2.start();
	
	
	}
}

