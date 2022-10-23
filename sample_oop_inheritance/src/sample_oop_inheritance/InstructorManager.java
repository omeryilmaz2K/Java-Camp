package sample_oop_inheritance;

public class InstructorManager extends UserManager {
	
	public void addBranch(Instructor instructor, String branchName) {
		instructor.setBranch(branchName);
		System.out.println(instructor.getBranch() + " başarıyla eklendi.");
	}
}
