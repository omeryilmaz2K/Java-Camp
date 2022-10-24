package sample_oop_sustainability.business;

import java.util.List;

import sample_oop_sustainability.core.logging.Logger;
import sample_oop_sustainability.data_access.CourseDao;
import sample_oop_sustainability.entities.Course;

public class CourseManager {
	private List<Course> courses;
	private CourseDao courseDao;
	private Logger logger;
	
	public CourseManager(List<Course> courses, CourseDao courseDao, Logger logger) {
		this.courses = courses;
		this.courseDao = courseDao;
		this.logger = logger;
	}

	public void addCourse(Course course) throws Exception {
		for (Course c : courses) 
			if (c.getName() == course.getName())
				throw new Exception("Kurs ismi tekrar edemez!");
		if (course.getPrice() < 0)
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz!");
		courses.add(course);
		System.out.println("Kurs başarıyla eklendi: " + course.getName());
		courseDao.add(course);
		logger.log(course.getName());
	}
}
