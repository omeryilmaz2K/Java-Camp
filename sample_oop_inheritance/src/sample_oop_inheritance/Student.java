package sample_oop_inheritance;

public class Student extends User {
	private String university;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String university) {
		super(id, firstName, lastName);
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
}
