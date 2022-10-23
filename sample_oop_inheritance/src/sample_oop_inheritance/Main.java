package sample_oop_inheritance;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor(0, "Engin", "Demiroğ");
		Student student = new Student(1, "Ömer", "Yılmaz");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor);
		StudentManager studentManager = new StudentManager();
		studentManager.addUser(student);
		instructorManager.addBranch(instructor, "Java");
		System.out.println(instructor.getBranch());
		studentManager.addUniversity(student, "Bandırma MYÖ");
		System.out.println(student.getUniversity());
	}
}
