package sample_oop;

public class Student {
	private int id;
	private String studentNumber;
	private String firstName;
	private String lastName;
	private String lastReadBook;
	
	public Student() {
		
	}
	
	public Student(int id, String studentNumber, String firstName, String lastName) {
		super();
		this.id = id;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastReadBook() {
		return lastReadBook;
	}
	
	public void setLastReadBook(String lastReadBook) {
		this.lastReadBook = lastReadBook;
	}
}
