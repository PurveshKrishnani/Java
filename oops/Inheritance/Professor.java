package oops.Inheritance;

public class Professor   extends FacultyMember {
    public Professor(double facultyID, String name, String department, float salary) {
        super(facultyID, name, department, salary);
    }

    public String getOfficeHours() {
        return officeHours;
    }

    private  String  officeHours;

}
