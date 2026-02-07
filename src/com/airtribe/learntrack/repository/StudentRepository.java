package com.airtribe.learntrack.repository;

import com.airtribe.learntrack.entity.Student;

import java.util.ArrayList;

public class StudentRepository {
  private ArrayList<Student> students = new ArrayList<>();

  public void save(Student s) {
    students.add(s);
  }

  public ArrayList<Student> findAll() {
    return students;
  }

  public Student findById(int id) {
    for (Student s : students) {
      if (s.getId() == id) {
        return s;
      }

    }
    return null;
  }
}

