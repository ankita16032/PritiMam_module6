package module6;

public class Student {

	private int rollNo;
	private String name;
	private double score;

	public Student() {
		rollNo = 0;
		name = null;
		score = 0.0;
	}

	public Student(int rollNo, String name, double score) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.score = score;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

//	public void display() {
//		System.out.println("roll no is: " + rollNo);
//		System.out.println("Name is : " + name);
//		System.out.println("Score is : " + score);
//	}

	public void markAttendance() {
		System.out.println("marking the attendance...");
	}

}
