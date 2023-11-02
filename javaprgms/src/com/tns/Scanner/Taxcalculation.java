package com.tns.Scanner;

public class Taxcalculation {

	public void calculateTax(person p)
	{
		if(p.getIncome()<=16000)
		{
			p.setTax(0);
		}
		
		else if(p.getIncome()>16000&& p.getIncome()<50000)
		{
			p.setTax(5);
		}
		
		else
		{
			p.setTax(10);
		}
	}
}


