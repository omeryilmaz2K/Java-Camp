package sample_oop_inheritance;

public class Instructor extends User {
	private String branch;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String branch) {
		super(id, firstName, lastName);
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
}
