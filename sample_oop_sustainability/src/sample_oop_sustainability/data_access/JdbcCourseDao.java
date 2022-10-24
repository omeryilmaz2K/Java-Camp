package sample_oop_sustainability.data_access;

import sample_oop_sustainability.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veri tabanına eklendi: " + course.getName());
	}

}
