package sample_oop;

public class LibraryManager {
	
	public void addStudent(Student student) {
		System.out.println(student.getStudentNumber() + " numaralı öğrenci kütüphaneye kayıt edildi.");
	}
	
	public void addLastReadBook(Student student, Book book) {
		student.setLastReadBook(book.getName());
		System.out.println(student.getStudentNumber() + " numaralı öğrenci için " + book.getName() + " son okunanlara eklendi.");
	}
}
