package com.tns.calci;

public class commission {

	String name;
	String address;
	int phone;
	int salesamount;
	int Commision; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getSalesamount() {
		return salesamount;
	}
	public void setSalesamount(int salesamount) {
		this.salesamount = salesamount;
	}
	public int getCommission() {
		return Commision;
	}
	public void setCommission(int salesamount) {
		this.Commision = Commision;
	}
	@Override
	public String toString() {
		return "commission [name=" + name + ", address=" + address + ", phone=" + phone + ", salesamount=" + salesamount
				+ ",Commission="+Commision+"]";
	}
	
}
