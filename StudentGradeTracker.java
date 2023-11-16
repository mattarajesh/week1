import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] studentNames = {"Ramesh", "Ravi", "Balu"};
        int[] studentGrades = {90, 85, 75};

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Capture the updated arrays
                    Object[] updatedArrays = addStudent(scanner, studentNames, studentGrades);
                    studentNames = (String[]) updatedArrays[0];
                    studentGrades = (int[]) updatedArrays[1];
                    break;
                case 2:
                    viewStudents(studentNames, studentGrades);
                    break;
                case 3:
                    calculateAverage(studentGrades);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add new student");
        System.out.println("2. View students and grades");
        System.out.println("3. Calculate average grade");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static Object[] addStudent(Scanner scanner, String[] studentNames, int[] studentGrades) {
        System.out.print("Enter the new student's name: ");
        String newName = scanner.nextLine();

        // Extend arrays to accommodate the new student
        String[] newStudentNames = new String[studentNames.length + 1];
        int[] newStudentGrades = new int[studentGrades.length + 1];

        // Copy existing data to the new arrays
        System.arraycopy(studentNames, 0, newStudentNames, 0, studentNames.length);
        System.arraycopy(studentGrades, 0, newStudentGrades, 0, studentGrades.length);

        // Add the new student
        newStudentNames[newStudentNames.length - 1] = newName;

        System.out.print("Enter the grade for " + newName + ": ");
        int newGrade = scanner.nextInt();

        newStudentGrades[newStudentGrades.length - 1] = newGrade;

        System.out.println(newName + " has been added with a grade of " + newGrade);

        // Return the updated arrays
        return new Object[]{newStudentNames, newStudentGrades};
    }

    private static void viewStudents(String[] studentNames, int[] studentGrades) {
        System.out.println("\nList of Students and Grades:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + ": " + studentGrades[i]);
        }
    }

    private static void calculateAverage(int[] studentGrades) {
        int sum = 0;
        for (int grade : studentGrades) {
            sum += grade;
        }
        double average = (double) sum / studentGrades.length;

        System.out.println("\nAverage Grade: " + average);
    }
}
