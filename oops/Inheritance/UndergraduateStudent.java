package oops.Inheritance;

public class UndergraduateStudent   extends Student {

    private  String program;


    public String getProgram() {
        return program;
    }


    public UndergraduateStudent(Double studentId, String name, String department, Float gpa) {
        super(studentId, name, department, gpa);
    }
}


