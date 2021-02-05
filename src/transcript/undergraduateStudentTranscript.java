package transcript;

public class undergraduateStudentTranscript extends studentTranscript{

    public undergraduateStudentTranscript() {
    }

    public undergraduateStudentTranscript(transcript.student student, course[] courses) {
        super(student, courses);
    }

    public double callGPA() {
        double totalCoursePoint = 0;
        int totalCredit = 0;

        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getMark() >= 90) {
                totalCoursePoint += 4*courses[i].getCredit();
                totalCredit += courses[i].getCredit();
            } else if (courses[i].getMark() >= 80 && courses[i].getMark() < 90) {
                totalCoursePoint += 3*courses[i].getCredit();
                totalCredit += courses[i].getCredit();
            } else if (courses[i].getMark() >= 70 && courses[i].getMark() < 80) {
                totalCoursePoint += 2*courses[i].getCredit();
                totalCredit += courses[i].getCredit();
            } else if (courses[i].getMark() >= 60 && courses[i].getMark() < 70) {
                totalCoursePoint += courses[i].getCredit();
                totalCredit += courses[i].getCredit();
            }
        }

        if (totalCredit == 0) {
            return 0;
        } else {
            return totalCoursePoint / totalCredit;
        }
    }

    @Override
    public void printTranscriptInfo(){
        final int semesterCode = 201510;
        final int semesterNumber = 1;

        System.out.println("STUDENT TRANSCRIPT\n");
        System.out.println("Name: " + student.getFirstName() + ' ' + student.getLastName());
        System.out.println("ID: " + student.getId());
        System.out.println("Semester Code: " + semesterCode);
        System.out.println("Semester No: " + semesterNumber + "\n");

        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course Code: " + courses[i].getCode());
            System.out.println("Course Title: " + courses[i].getTitle());
            System.out.println("Mark: " + courses[i].getMark());

            if (courses[i].getMark() >= 90) {
                System.out.println("Grade: A");
            } else if (courses[i].getMark() >= 80 && courses[i].getMark() < 90) {
                System.out.println("Grade: B");
            } else if (courses[i].getMark() >= 70 && courses[i].getMark() < 80) {
                System.out.println("Grade: C");
            } else if (courses[i].getMark() >= 60 && courses[i].getMark() < 70) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }
        System.out.println("\nStudent GPA: " + callGPA());
    }
}
