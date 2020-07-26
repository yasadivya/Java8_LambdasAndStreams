package com.epam.LambdasAndStreams_Java8;
import java.util.*;

public class averageOfIntegerList {
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(1); list.add(2);
		list.add(3); list.add(4);
		list.add(5); list.add(6);
		System.out.println("Average of Integer List : "+average(list));
	}
	public static Double average(List<Integer> list)
	{
		return list.stream().mapToDouble(l->l).average().orElse(Double.NaN);
	}

}
