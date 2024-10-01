package module6;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter roll no , name and score: ");
		int rollNo = sc.nextInt();
		String name = sc.next();
		double score = sc.nextDouble();

		Student student = new Student();// default
		student.setRollNo(rollNo);
		student.setName(name);
		student.setScore(score);

		// student.display();
		System.out.println("Displaying the details...");
		System.out.println("rollno is : " + student.getRollNo());
		System.out.println("Name is : " + student.getName());
		System.out.println("Score is : " + student.getScore());
		student.markAttendance();

		System.out.println("---------------------------");
		Student student1 = new Student(1, "Ank", 98);// parameterized
		// student1.display();
		System.out.println("Displaying the details...");
		System.out.println("rollno is : " + student1.getRollNo());
		System.out.println("Name is : " + student1.getName());
		System.out.println("Score is : " + student1.getScore());
		student1.markAttendance();

		System.out.println("---------------------------");
		System.out.println("Changing the name");
		System.out.println("Enter the new name: ");
		String name1 = sc.next();
		student1.setName(name1);
		System.out.println("new name is: " + student1.getName());
		System.out.println("Displaying the details...");
		System.out.println("rollno is : " + student1.getRollNo());
		System.out.println("Name is : " + student1.getName());
		System.out.println("Score is : " + student1.getScore());

	}

}
