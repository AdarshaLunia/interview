package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8StreamFilterExamples {
	public static void main(String[] args) {

		List studentList = createStudentList();

		// Filter all male students
		@SuppressWarnings({ "unchecked", "unused" })
		List maleStudents = (List) studentList.stream().filter(s -> ((Student) s).getGender().equalsIgnoreCase("M"))
				.collect(Collectors.toList());

		System.out.println("Male students are :" + maleStudents);

		// Filer based on name
		@SuppressWarnings("unchecked")
		Object student = studentList.stream().filter(s -> ((Student) s).getName().equalsIgnoreCase("John")).findAny()
				.orElse(null);
		System.out.println("Student with Name john :" + student);

		// Filter all male student who have age > 18
		Predicate predicate1 = s -> ((Student) s).getGender().equalsIgnoreCase("M") && ((Student) s).getAge() > 18;
		List students1 = filterStudents(studentList, predicate1);
		System.out.println("Male students having age > 18 are :" + students1);

		// Filer all female student who have age < 18 
		
		Predicate predicate2= s-> ((Student) s).getGender().equalsIgnoreCase("F") && ((Student) s).getAge() < 18;
		List students2=filterStudents(studentList, predicate2);
	    System.out.println("Female students having age < 18 are :"+students2);
	    
	    
	    int total = (int) studentList.stream().collect(Collectors.summingInt(Student::getAge));
	    
	    System.out.println("Total :"+total);


	}

	@SuppressWarnings("unchecked")
	public static List filterStudents(List students, Predicate predicate) {
		return (List) students.stream().filter(predicate).collect(Collectors.toList());
	}

	public static List createStudentList() {
		List studentList = new ArrayList();
		Student s1 = new Student(1, "Arpit", "M", 19);
		Student s2 = new Student(2, "John", "M", 17);
		Student s3 = new Student(3, "Mary", "F", 14);
		Student s4 = new Student(4, "Martin", "M", 21);
		Student s5 = new Student(5, "Monica", "F", 16);
		Student s6 = new Student(6, "Ally", "F", 20);

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		return studentList;
	}
}
