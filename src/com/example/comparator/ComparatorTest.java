package com.example.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		Student[] student = { new Student("001", "Adarsha", 20.89), new Student("003", "Vivid", 10.89),
				new Student("002", "Shruti", 35.89) };

		Comparator<Student> lambdaComparator = (Student emp1, Student emp2) -> {
			return (emp1.getName().compareTo(emp2.getName()));
		};

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(student));
		
		Arrays.sort(student);
		
		Arrays.sort(student,new Student());
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(student));
		
		
		
		
	}

}
