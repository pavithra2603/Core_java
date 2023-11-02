package com.tns.exception;

public class Nestedtrycatch {

	public static void check()
	{
		String str="TNS";
		int length=str.length();
		System.out.println("string length "+length);
		String anotherstring=null;
		int y=5;
		try
		{
			try
			{
				System.out.println(str.charAt(y));//exception occured
			}
			catch(StringIndexOutOfBoundsException e)
			{
			System.out.println("indexouofbound"+e.getMessage());
			}
			System.out.println("string length"+anotherstring.length());
		}
			catch(NullPointerException n)
			{
				System.out.println("exception is thrown"+n.getMessage());
			}
		
		}
	}

