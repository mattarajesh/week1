# week1
#ASSIGNMENT - 1 EXPLANATION
# Student Grade Tracker Documentation

## Overview

The **Student Grade Tracker** is a simple Java console-based program designed to assist teachers in managing student information and grades. It allows teachers to perform various actions, such as adding new students, viewing a list of students along with their grades, and calculating the average grade of all students.

## Features

### 1. Add New Student

Allows the addition of a new student to the system. The teacher is prompted to enter the new student's name and corresponding grade.

### 2. View Students and Grades

Displays a list of all students along with their respective grades.

### 3. Calculate Average Grade

Calculates and displays the average grade of all students.

### 4. Exit

Allows the teacher to exit the program.

## Usage

1. Run the program.
2. The program will present a menu with options from 1 to 4.
3. Enter the number corresponding to the desired action and press Enter.

## Program Flow

1. The program initializes with a set of default students and their grades.
2. A menu is displayed, and the teacher can choose from various options.
3. Depending on the selected option, the program executes the corresponding functionality.
4. The program continuously runs until the teacher chooses to exit.

## Functions

### `displayMenu()`

Displays the main menu with options for the teacher.

### `addStudent(Scanner scanner, String[] studentNames, int[] studentGrades)`

Adds a new student to the system. Prompts the teacher to enter the new student's name and grade.

### `viewStudents(String[] studentNames, int[] studentGrades)`

Displays a list of all students and their corresponding grades.

### `calculateAverage(int[] studentGrades)`

Calculates and displays the average grade of all students.

### `main(String[] args)`

The main method that orchestrates the program flow. It includes the main loop where the teacher interacts with the program.

## How to Run

1. Compile the Java source file: `javac StudentGradeTracker.java`
2. Run the compiled program: `java StudentGradeTracker`

## Notes

- The program uses a simple console interface for ease of use.
- The teacher can repeatedly perform actions until choosing to exit.

