package com.tns.inheritnce;

public class cub extends lion{
void roar()
{
	System.out.println("cub is so adorable");
}

public static void main(String args[])
{ 
	lion l=new lion();
	l.roar();
	cub c=new cub();
	c.roar();
	
}
}