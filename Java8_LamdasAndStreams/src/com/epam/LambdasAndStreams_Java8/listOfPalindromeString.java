package com.epam.LambdasAndStreams_Java8;

import java.util.*;
import java.util.function.Predicate;

public class listOfPalindromeString {
	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		list.add("12321");
		list.add("827198");
		list.add("11111");
		list.add("92532");
		list.add("979797");
		Predicate<String> pre=(String str) -> str.equals(new StringBuilder(str).reverse().toString());
		List<String> palindromes=palindromeStrings(list,pre);
		System.out.println("Palindromes in the given list are : "+palindromes);
	}
	static List<String> palindromeStrings(List<String> list,Predicate<String> pre)
	{
		List<String> result=new ArrayList<String>();
		for(int i=0;i<list.size();i++)
		{
			if(pre.test(list.get(i)))
				result.add(list.get(i));
		}
		return result;
	}

}
