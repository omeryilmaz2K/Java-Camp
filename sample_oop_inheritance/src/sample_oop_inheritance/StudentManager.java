package sample_oop_inheritance;

public class StudentManager extends UserManager {

	public void addUniversity(Student student, String universityName) {
		student.setUniversity(universityName);
		System.out.println(student.getUniversity() + " başarıyla eklendi");
	}
}
