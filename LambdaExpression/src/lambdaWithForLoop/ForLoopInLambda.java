package lambdaWithForLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * In this class i explain possible way for using Lambda expression in list
 * */
public class ForLoopInLambda {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("kelly", "Joseph"));
		students.add(new Student("Minh", "Thu"));
		
		// Simple way for calling list by using for loop
		
		students.forEach(studentList -> {
			System.out.print(studentList.getFirstName() + " ");
			System.out.println(studentList.getLastName());
		});

		
		// sorting by using Lambda expression 
		
		Collections.sort(students,(firstname , lastname) -> {
			return firstname.getFirstName().compareTo(lastname.getFirstName());
		});
		
		for (Student student : students) {
			System.out.println(student.getFirstName());
		}
	}
}
