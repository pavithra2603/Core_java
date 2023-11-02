package com.tns.lambdaprrgms;
import java.util.ArrayList;
public class lambdacollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>li=new ArrayList<>();
li.add(20);
li.add(47);
li.add(15);
//traversing list using for each loop
for(Integer el:li)
{
	System.out.println(el);
}
li.forEach(element->System.out.println(element));
	}

}
