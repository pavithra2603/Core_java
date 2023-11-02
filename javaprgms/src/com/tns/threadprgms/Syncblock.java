package com.tns.threadprgms;

public class Syncblock implements Runnable{
	
	int token=1;
	public void run()
	{
		synchronized(this)
		{
			Thread t=Thread.currentThread();
			String name=t.getName();
			System.out.println(token + " alloted to " + name);
			token++;
		}
	}

}
