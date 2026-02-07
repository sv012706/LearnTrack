package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.repository.CourseRepository;

public class CourseService {
  private CourseRepository courseRepository = new CourseRepository();

  public void addCourse(Course course)
  {
    courseRepository.save(course);
  }
  public Course getcourse(int id) throws EntityNotFoundException
  {
    Course course=courseRepository.findById(id);
     if(course==null) throw  new EntityNotFoundException("Course not found");
       return course;
  }
public void listOfCourses()
{
  for(Course course:courseRepository.findAll())
  {
    System.out.println(course.getCourseName()+"|"+ course.getActive());
  }
}
}
