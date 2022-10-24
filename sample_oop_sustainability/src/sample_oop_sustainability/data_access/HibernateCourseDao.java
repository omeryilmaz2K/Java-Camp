package sample_oop_sustainability.data_access;

import sample_oop_sustainability.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanına eklendi: " + course.getName());
	}

}
