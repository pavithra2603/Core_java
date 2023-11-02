package com.tns.constructor;

public class customer {

	private String name;
	private int customerid;
	private String customercity;
//default constructor	
	public customer() {
		System.out.println("default constructor");
		// TODO Auto-generated constructor stub
	}
	//parameterised constructor
public customer(String name, int customerid, String customercity)
{
	this();
	this.name=name;
	this.customerid=customerid;
	this.customercity=customercity;
	
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustomercity() {
	return customercity;
}
public void setCustomercity(String customercity) {
	this.customercity = customercity;
}
@Override
public String toString() {
	return "customer [name=" + name + ", customerid=" + customerid + ", customercity=" + customercity + "]";
}

}
