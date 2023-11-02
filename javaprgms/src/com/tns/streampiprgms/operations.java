package com.tns.streampiprgms;
import java.util.Arrays;

import java.util.IntSummaryStatistics;
import java.util.List;
public class operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> prime=Arrays.asList(2,3,4,5,6);
IntSummaryStatistics stats=prime.stream().mapToInt((x)->x).summaryStatistics();
System.out.println("highest number is:"+stats.getMax());
System.out.println("Lowest number is:"+stats.getMin());
System.out.println("sum of all number is:"+stats.getSum());
System.out.println("Averge of all number is:"+stats.getAverage());
	}

}
