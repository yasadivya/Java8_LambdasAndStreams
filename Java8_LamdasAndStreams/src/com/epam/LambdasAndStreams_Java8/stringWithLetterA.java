package com.epam.LambdasAndStreams_Java8;

import java.util.*;
import java.util.stream.Collectors;

public class stringWithLetterA {
	public static void main(String args[]) 
	{
		List<String> a=new ArrayList<String>();
		a.add("apple");
		a.add("anjali");
		a.add("arun");
		a.add("aunt");
		a.add("art");
		a.add("ant");
		a.add("anaconda");
		a.add("arc");
		
		System.out.println("List : "+filter(a));
	}
	static List<String> filter(List<String> a)
	{
		return a.stream().filter(str -> str.startsWith("a") && str.length()==3).collect(Collectors.toList());
	}

}
