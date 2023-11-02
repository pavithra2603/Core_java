package com.tns.streampiprgms;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>cities=new ArrayList<>();
cities.add("mumbai");
cities.add("chennai");
cities.add("dubai");
System.out.println(cities);
Consumer <String> printconsumer=city->System.out.println(city);
cities.forEach(printconsumer);
	}

}
