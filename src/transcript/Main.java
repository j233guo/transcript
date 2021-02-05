package transcript;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student First Name: ");
        String firstName = input.next();

        System.out.print("Enter Student Last Name: ");
        String lastName = input.next();

        System.out.print("Enter Student ID: ");
        String studentID = input.next();

        System.out.print("\nEnter the number of courses you did in the above semester: ");
        int n = input.nextInt();

        System.out.print("\nWhat type of Student are you? \n" +
                        "'U' or 'u': Undergraduate\n" +
                        "'C' or 'c': Certificate\n" +
                        "Enter Student Code: ");
        String type = input.next();

        if (type.equals("U") || type.equals("u")) {
            student s = new student(studentID, firstName, lastName, type);
            course[] courses = new course[n];

            for (int i = 0; i < n; i++) {
                input.nextLine();
                System.out.print("\nEnter Course Code: ");
                String courseCode = input.nextLine();

                System.out.print("Enter Course Title: ");
                String courseTitle = input.nextLine();

                System.out.print("Enter Number of Course Credit: ");
                int credit = input.nextInt();

                System.out.print("Enter Mark received in course: ");
                double mark = input.nextDouble();

                course c = new course(courseCode, courseTitle, credit, mark);
                courses[i] = c;
            }
            System.out.println("\nThanks, displaying student transcript: \n");
            undergraduateStudentTranscript t = new undergraduateStudentTranscript(s, courses);
            t.printTranscriptInfo();
        } else if (type.equals("C") || type.equals("c")) {
            student s = new student(studentID, firstName, lastName, type);
            course[] courses = new course[n];

            for (int i = 0; i < n; i++) {
                input.nextLine();
                System.out.print("\nEnter Course Code: ");
                String courseCode = input.nextLine();

                System.out.print("Enter Course Title: ");
                String courseTitle = input.nextLine();

                System.out.print("Enter Mark received in course: ");
                double mark = input.nextDouble();

                course c = new course(courseCode, courseTitle, mark);
                courses[i] = c;
            }
            System.out.println("\nThanks, displaying student transcript: \n");
            certificateStudentTranscript t = new certificateStudentTranscript(s, courses);
            t.printTranscriptInfo();
        } else {
            System.out.println(type + " is not a valid student type");
        }
    }
}
