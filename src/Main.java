import com.airtribe.learntrack.constants.MenuOptions;
import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.InvalidInputException;
import com.airtribe.learntrack.service.CourseService;
import com.airtribe.learntrack.service.EnrollmentService;
import com.airtribe.learntrack.service.StudentService;
import com.airtribe.learntrack.util.IdGenerator;

import java.util.Scanner;

public class Main{
public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);
    StudentService studentService=new StudentService();
    EnrollmentService enrollmentService=new EnrollmentService();
    CourseService courseService=new CourseService();
    while(true)
    {
      System.out.println("\n1.Add Students");
      System.out.println("2. View Students");
      System.out.println("3. Add Course");
      System.out.println("4. View Courses");
      System.out.println("5. Enroll Student");
      System.out.println("0. Exit");
      int choice = scanner.nextInt();
      scanner.nextLine();
      try
      {
        switch (choice)
        {
          case MenuOptions.Add_student ->
          {
            System.out.println("Enter your First Name:");
            String first_name=scanner.nextLine();
            System.out.println("Enter your Last Name:");
            String Last_Name=scanner.nextLine();
            System.out.println("Enter your Email:");
            String Email=scanner.nextLine();
            System.out.println("Enter your Batch:");
            String Batch=scanner.nextLine();
            Student s=new Student(IdGenerator.getStudentId(),first_name,Last_Name,Email,Batch);
            studentService.addStudent(s);
            break;
          }
          case MenuOptions.View_allstudents ->
          {
            studentService.getAllStudents();
            break;
          }
          case MenuOptions.Add_course ->
          {
            System.out.println("Enter Course name:");
            String Course_name=scanner.nextLine();
            System.out.println("Enter your course description:");
            String Description=scanner.nextLine();
            System.out.println("Enter duration of weeks:");
            int Duration=scanner.nextInt();

            Course course=new Course(IdGenerator.getCourseId(),Course_name,Description,Duration);
            courseService.addCourse(course);
            break;
          }
          case MenuOptions.Viewallcourses ->
          {
            courseService.listOfCourses();
            break;
          }
          case MenuOptions.Enroll_Student ->
          {
            System.out.println("Enter Student id:");
            int S_id=scanner.nextInt();
            System.out.println("Enter Course id:");
            int c_id=scanner.nextInt();
            Enrollment enrollment=new Enrollment(IdGenerator.getEnrollmentId(),S_id,c_id);
            enrollmentService.enroll(enrollment);
            break;
          }
          case MenuOptions.exit ->
          System.exit(0);
          default ->
            System.out.println("Invalid option");
        }

        }catch (Exception e)
         {
        System.out.println("Error"+e.getMessage());
         }
      }
  }
}
