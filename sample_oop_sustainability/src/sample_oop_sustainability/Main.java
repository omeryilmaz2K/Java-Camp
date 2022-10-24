package sample_oop_sustainability;

import java.util.ArrayList;
import java.util.List;

import sample_oop_sustainability.business.CategoryManager;
import sample_oop_sustainability.business.CourseManager;
import sample_oop_sustainability.core.logging.DatabaseLogger;
import sample_oop_sustainability.core.logging.FileLogger;
import sample_oop_sustainability.data_access.HibernateCourseDao;
import sample_oop_sustainability.entities.Category;
import sample_oop_sustainability.entities.Course;
import sample_oop_sustainability.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Instructor instructor1 = new Instructor(0, "Engin", "Demiroğ");
		Course course1 = new Course(0, "Java Kursu", 0);
		Course course2 = new Course(1, "C# Kursu", 0);
		Course course3 = new Course(2, "Python Kursu", 0);
		List<Course> courses = new ArrayList<>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		Category category1 = new Category(0, "Fonksiyonel Programlama");
		Category category2 = new Category(1, "Nesne Yönelimli Programlama");
		List<Category> categories = new ArrayList<>();
		categories.add(category1);
		categories.add(category2);
		CourseManager courseManager = new CourseManager(courses, new HibernateCourseDao(), new DatabaseLogger());
		Course course4 = new Course(3, "Javascript Kursu", 0);
		Course course5 = new Course(3, "R Kursu", -15);
		courseManager.addCourse(course4);
//		courseManager.addCourse(course4); Exception!
//		courseManager.addCourse(course5); Exception!
		CategoryManager categoryManager = new CategoryManager(categories, new FileLogger());
//		categoryManager.addCategory(category2); Exception!
		Category category3 = new Category(2, "Prosedürel Programlama");
		categoryManager.addCategory(category3);
	}
}
