package sample_oop;

public class Book {
	private int id;
	private String name;
	private String subject;
	private String author;
	
	public Book() {
		
	}
	
	public Book(int id, String name, String subject, String author) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.author = author;
	}

	public int getId() {
		return id + 1;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
