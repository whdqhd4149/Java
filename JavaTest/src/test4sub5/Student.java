package test4sub5;

public class Student {
	
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int [10];
		this.subjectCount = 0;
		
	}
	
	public void enrollSubject(Subject subject) {
		
		this.subjects = new Subject[10];
		
	}
	
	public void setScore(Subject subject, int score) {
		
	}
	
	public void printStudentInfo() {
		
	}
	
	public String getName() {
		return name;
	}

}
