package sample_oop_inheritance;

public class Student extends User {
	private String university;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
}
