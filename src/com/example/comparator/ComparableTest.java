package com.example.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest {

	public static void main(String[] args) {
		Student[] student = {
				new Student("001", "Adarsha", 20.89),
				new Student("003", "Vivid", 10.89),
				new Student("002", "Lalita", 35.89) };

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(student));

		// Arrays.sort(student);
		Arrays.sort(student, new NameComparator()); // Name Comparator

		System.out.println("After Sorting");
		System.out.println(Arrays.toString(student));
	}

	
}
