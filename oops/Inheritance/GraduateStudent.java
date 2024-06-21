package oops.Inheritance;

public class GraduateStudent  extends Student {

    public GraduateStudent(Double studentId, String name, String department, Float gpa) {
        super(studentId, name, department, gpa);
    }

    public String getSubjects() {
        return subjects;
    }

    private String  subjects;
}

