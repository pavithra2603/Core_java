package com.tns.inheritnce;

public class Citizen {

	private String name;
	private long aadharNo;
	private String address;
	private long phoneno;
	public Citizen()
	{
		super();
	}
	
public Citizen(String name,long aadharNo,String address, long phoneno)
{
	super();
	this.name = name;
	this.aadharNo = aadharNo;
	this.address = address;
	this.phoneno = phoneno;
	
	
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAadharNo() {
	return aadharNo;
}
public void setAadharNo(long aadharNo) {
	this.aadharNo = aadharNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
@Override
public String toString() {
	return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phoneno=" + phoneno + "]";
}
}