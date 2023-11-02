package com.tns.calci;

public class commissioncalc
{
 public void Calculatecomm(commission c)
{

if(c.getSalesamount()>=100000)
{
	c.setCommission(10);
}

else if(c.getSalesamount()>=50000 && c.getSalesamount()<100000)
{
	c.setCommission(5);
}
else if(c.getSalesamount()>=30000 && c.getSalesamount()<50000)
{
	c.setCommission(3);
}
else
{
	c.setCommission(0);
}

}

}
