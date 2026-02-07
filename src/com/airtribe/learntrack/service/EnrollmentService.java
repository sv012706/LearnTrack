package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.repository.EnrollmentRepository;

public class EnrollmentService {
  private EnrollmentRepository enrollmentRepository=new EnrollmentRepository();
  public void enroll(Enrollment enrollment)
  {
    enrollmentRepository.save(enrollment);
  }

}
