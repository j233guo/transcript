package transcript;

public class certificateStudentTranscript extends studentTranscript {

    public certificateStudentTranscript() {
    }

    public certificateStudentTranscript(transcript.student student, course[] courses) {
        super(student, courses);
    }

    @Override
    public void printTranscriptInfo() {
        System.out.println("STUDENT TRANSCRIPT\n");
        System.out.println("Name: " + student.getFirstName() + ' ' + student.getLastName());
        System.out.println("ID: " + student.getId()+ "\n");

        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course Code: " + courses[i].getCode());
            System.out.println("Course Title: " + courses[i].getTitle());
            System.out.println("Marks received in course: " + courses[i].getMark());

            if (courses[i].getMark() >= 50) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
