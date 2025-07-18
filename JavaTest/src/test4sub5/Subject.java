package test4sub5;

public class Subject {
	
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName) {
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
		
	}
	
	public void addStudent(Student student) {
		
	}
	
	public void printSubjectInfo() {
		
	}
	
	public String getName() {
		return subName;
		
	}

}
