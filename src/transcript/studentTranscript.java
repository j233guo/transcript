package transcript;

public abstract class studentTranscript {

    protected student student;
    protected course[] courses;

    public studentTranscript() {}

    public studentTranscript(transcript.student student, course[] courses) {
        this.student = student;
        this.courses = courses;
    }

    public void setStudent(transcript.student student) {
        this.student = student;
    }

    public void setCourses(course[] courses) {
        this.courses = courses;
    }

    public transcript.student getStudent() {
        return student;
    }

    public course[] getCourses() {
        return courses;
    }

    public void printTranscriptInfo(){}
}

