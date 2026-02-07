
### LearnTrack – Student & Course Management System

## Project Overview

LearnTrack is a console-based Student & Course Management System built using Core Java. It demonstrates fundamental Java concepts including OOP, collections, exception handling, and layered architecture.

The system allows administrators to manage:

* Students
* Courses
* Enrollments

This project focuses on clean architecture and Core Java fundamentals without external frameworks.

## Features

* Add and view students
* Add and view courses
* Enroll students in courses
* Menu-driven console interface
* In-memory data storage
* Custom exception handling
* Layered architecture (UI → Service → Repository)

## Technologies Used

* Core Java
* Java Collections (ArrayList)
* OOP Principles
* Exception Handling
* Enums and Constants

## Project Structure

entity → Data models
repository → In-memory storage
service → Business logic
util → Helper classes
exception → Custom exceptions
constants → App constants
enums → Fixed states
Main.java → Entry point

## How to Compile and Run

## Compile

javac -d out src/com/airtribe/learntrack/**/*.java

## Run

java -cp out com.airtribe.learntrack.Main

## Learning Outcomes

* Object-Oriented Programming
* Inheritance and Polymorphism
* Encapsulation
* Static members
* Layered architecture
* Clean code practices

## ER Diagram
+------------------+
|     STUDENT      |
+------------------+
| student_id (PK)  |
| first_name       |
| last_name        |
| email            |
| batch            |
| active           |
+------------------+
        |
        | 1
        |
        | N
+------------------+
|   ENROLLMENT     |
+------------------+
| enrollment_id PK |
| student_id  FK   |
| course_id   FK   |
| enrollment_date  |
| status           |
+------------------+
        |
        | N
        |
        | 1
+------------------+
|      COURSE      |
+------------------+
| course_id (PK)   |
| course_name      |
| description      |
| duration_weeks   |
| status           |
+------------------+
# Setup Instructions

## JDK Version

JDK 17 or above is recommended.

---

## Install Java

1. Download JDK from Oracle or OpenJDK website
2. Install and configure environment variables
3. Verify installation:

```
java -version
javac -version
```

---

## Hello World Test

Create a file:

```
Hello.java
```

```
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

Compile and run:

```
javac Hello.java
java Hello
```

If output appears, Java setup is successful.
# JVM Basics

## JDK vs JRE vs JVM

### JVM (Java Virtual Machine)

JVM is the engine that runs Java programs. It converts bytecode into machine code so it can run on any operating system.

### JRE (Java Runtime Environment)

JRE contains the JVM and libraries required to run Java applications.

### JDK (Java Development Kit)

JDK includes JRE plus development tools like the Java compiler (javac). It is used to develop Java programs.

---

## What is Bytecode?

When Java source code is compiled, it is converted into bytecode. This bytecode is platform-independent and executed by the JVM.

---

## Write Once, Run Anywhere

Java programs compile into bytecode, which runs on any device that has a JVM. This makes Java platform-independent.
# Design Notes

## Why ArrayList Instead of Arrays

ArrayList is dynamic and resizable. It allows easy insertion and deletion compared to fixed-size arrays.

---

## Use of Static Members

Static counters in IdGenerator ensure unique IDs across the application without creating multiple generator objects.

---

## Use of Inheritance

Student extends Person to reuse common attributes like name and email. This reduces code duplication and improves maintainability.

---

## Architecture Design

The project uses layered architecture:

* UI Layer → handles user interaction
* Service Layer → contains business logic
* Repository Layer → stores data in memory
* Entity Layer → represents domain models

This separation improves readability and scalability.

---

## Clean Code Practices

* Small, focused methods
* Meaningful class and method names
* Separation of concerns
* Consistent package structure



