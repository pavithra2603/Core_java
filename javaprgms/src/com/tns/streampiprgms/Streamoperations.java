package com.tns.streampiprgms;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Streamoperations {
public void operations()
{
	Stream<Integer>stream=Stream.of(10,20,30,40,50);
	stream.forEach(System.out::println);
	
	//CREATING A STREAM FROM ARRAY
	Integer[] values=new Integer[] {23,24,25,28};
	stream=Arrays.stream(values);
	
	//map function
	System.out.println("square of"+Arrays.toString(values));
	stream.map(num->num*num).forEach(System.out::println);
	
	//limit returns first n element
	System.out.println("first 2 elements");
	Arrays.stream(values).limit(2).forEach(System.out::println);
	
	//skip
	System.out.println("skipping first 3 elements");
	Arrays.stream(values).skip(3).forEach(System.out::println);
	
	//sorted
	System.out.println("sorting the elements");
	Arrays.stream(values).sorted().forEach(System.out::println);
	
	//distinct elements
	Integer[] value=new Integer[] {20,30,45,45,40,30,35};
	System.out.println("distinct elements");
	Arrays.stream(value).distinct().forEach(System.out::println);
	
	


}
}
