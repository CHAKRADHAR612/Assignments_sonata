package com.assignments.ques2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentTest {

	public List<Student> getStudentsInSort(){
		List<Student> students=new LinkedList<>();
		students.add(new Student(1,"chakri",90));
		students.add(new Student(2,"prudhvi",95));
		students.add(new Student(3,"chandra",93));
		Collections.sort(students, (o1,o2)-> o1.getMarks().compareTo(o2.getMarks()));
		return students; 
	}
	public static void main(String[] args) {
		List<Student> students=new StudentTest().getStudentsInSort();
		for(Student s:students) {
			System.out.println(s);
		}
	}

}
