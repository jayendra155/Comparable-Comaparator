package com.application.comparators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

	public Student readStudent() throws IOException {
		System.out.println("Enter first and last name along with roll number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Student student = new Student();
		student.setFirstName(br.readLine());
		student.setLastName(br.readLine());
		student.setRollNumber(Integer.parseInt(br.readLine()));
		System.out.println("Read object is :" + student);
		return student;
	}

	public static void main(String[] args) throws IOException {
		Application obj = new Application();
		Set<Student> studentsSet = new HashSet<Student>();
		for (int i = 0; i < 4; i++)
			studentsSet.add(obj.readStudent());
		List<Student> students = new ArrayList<Student>(studentsSet);
		System.out.println("Valuesa after sorting by first name are : ");
		Comparator<Student> byFirstName = new FirstNameComparator();
		Comparator<Student> byRollNumber = new RollNumberComparator();
		Collections.sort(students, byFirstName);
		for (Student student : students) {
			System.out.println(student.toString());
		}
		System.out.println("Valuesa after sorting by roll no. are : ");
		Collections.sort(students, byRollNumber);
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

}
