package tn.fst.spring.skistation.services;

import tn.fst.spring.skistation.entities.Course;

import java.util.List;

public interface ICourseService {
    List<Course> retrieveAllCourses();
    Course addOrUpdateCourse(Course course);
    void removeCourse(Long numCourse);
    Course retrieveCourse(Long numCourse);
}
