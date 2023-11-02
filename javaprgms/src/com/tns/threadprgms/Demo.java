package com.tns.threadprgms;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Syncblock a1=new Syncblock();
	Thread t1=new Thread(a1);
	Thread t2=new Thread(a1);
	Thread t3=new Thread(a1);
	t1.setName("t1");
	t2.setName("t2");
	t3.setName("t3");
	t1.start();
	t2.start();
	t3.start();
	}

}
