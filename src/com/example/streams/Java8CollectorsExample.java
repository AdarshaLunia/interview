package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
You can do various operations such as average, count, groupby, 
sort the list with the help of Collectors*/

public class Java8CollectorsExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List intList = Arrays.asList(10, 20, 30, 40, 50);
		// Counting
		long count = (long) intList.stream().collect(Collectors.counting());
		System.out.println(count);

		
		
		List NameList=Arrays.asList("Arpit","John","Martin");
		// Counting
		String  stringWithHyphen = (String) NameList.stream().collect(Collectors.joining("-"));
		System.out.println("String with hyphen : "+stringWithHyphen);
		String  stringWithHyphenAndPrefixAndSuffix = (String) NameList.stream().collect(Collectors.joining("-","==","=="));
		System.out.println("String with hyphen , suffix and prefix :  "+stringWithHyphenAndPrefixAndSuffix);	

	}
}
