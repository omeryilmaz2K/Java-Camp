package sample_oop;

import java.text.MessageFormat;

public class Main {
	
	public static void main(String[] args) {
		Book book1 = new Book(0, "Diriliş - Çanakkale 1915" , "Turgut Özakman'ın Çanakkale Savaşı'nı anlattığı romandır.", "Turgut Özakman");
		Book book2 = new Book(1, "Marslı", "Mars'da mahsur kalan Mark Watney adlı astronotun hikayesini anlatan romandır.", "Andy Weir");
		Book book3 = new Book(2, "Da Vinci Şifresi", "İsa'nın kilisenin iddia ettiği gibi tanrısal bir kişi olmadığını anlatan romandır.", "Dan Brown");
		Book[] books = {
			book1,
			book2,
			book3
		};
		for (Book book : books) {
			System.out.println(MessageFormat.format("{0}) {1}: {2} Yazan: {3}", book.getId(), book.getName(), book.getSubject(), book.getAuthor()));
		}
		Student student1 = new Student(0, "2113007016", "Ömer", "Yılmaz");
		LibraryManager manager = new LibraryManager();
		manager.addStudent(student1);
		manager.addLastReadBook(student1, book3);
	}
}
