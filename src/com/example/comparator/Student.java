package com.example.comparator;

import java.util.Comparator;

public class Student implements Comparable<Student> ,Comparator<Student> {

	String id;
	String name;
	Double cgpa;
	String firstName;
	String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCgpa() {
		return cgpa;
	}

	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", cgpa=" + cgpa +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}

	public Student(String id, String name, Double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Student that) {
		return this.id.compareTo(that.id);
	}

	@Override
	public int compare(Student student01, Student student02) {
		// Comparator Example
		return student01.name.compareTo(student02.name);
	}

	public Student(String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
