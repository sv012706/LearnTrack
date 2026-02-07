package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.repository.StudentRepository;

public class StudentService {
  private StudentRepository studentRepository=new StudentRepository();



  public void addStudent(Student student)
  {
    studentRepository.save(student);
  }
  public Student getStudent(int id)throws EntityNotFoundException
  {
    Student student=studentRepository.findById(id);
    if(student==null) throw new EntityNotFoundException("Student not found");
    return student;
  }
  public void getAllStudents()
  {
    for(Student student:studentRepository.findAll())
    {
      System.out.print(student.Display_Name()+"|");
      System.out.print(student.isActive()?"ACTIVE":"INACTIVE");
    }
  }
}
