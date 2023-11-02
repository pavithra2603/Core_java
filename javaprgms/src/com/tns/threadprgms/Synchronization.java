package com.tns.threadprgms;

public class Synchronization implements Runnable{
	int tickets=3;
	static int i=1, j=2, k=3;
	public synchronized void bookticket(String name, int wantedtickets)
	{
		if(wantedtickets<=tickets)
		{
			System.out.println(wantedtickets + " booked to " + name)	;
			tickets=tickets-wantedtickets;
		}
		else
		{
			System.out.println("No tickets available");
		}
	}
	public void run()
	{
		String name=Thread.currentThread().getName();
		if(name.equals("person1"))
		{
			bookticket(name,i);
		}
		else if(name.equals("person2"))
		{
			bookticket(name,j);
		}
		else
		{
			bookticket(name,k);
		}
	}
public static void main (String args[]) {
	Synchronization s=new Synchronization();
	Thread t1=new Thread(s);
	Thread t2=new Thread(s);
	Thread t3=new Thread(s);
	t1.setName("person1");
	t2.setName("person2");
	t3.setName("person3");
	t1.start();
	t2.start();
	t3.start();
}
	
}
