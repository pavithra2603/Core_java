package com.tns.streampiprgms;
import java.util.ArrayList;
import java.util.function.Predicate;
public class predicate {
public static void main(String args[])
{
      ArrayList<String>cities=new ArrayList<>();
	cities.add("chennai");
	cities.add("Delhi");
	cities.add("Bangalore");
	Predicate <String>filtercity=city->city.equals("Delhi");
	boolean result=filtercity.test("Delhi");
	System.out.println(result);
	
}
}
