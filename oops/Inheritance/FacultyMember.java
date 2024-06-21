package oops.Inheritance;

public class FacultyMember {
    @Override
    public String toString() {
        return "FacultyMember{" +
                "facultyID=" + facultyID +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    private  double facultyID;
    private  String name;
    private String department;
    private float salary;

    public FacultyMember(double facultyID, String name, String department, float salary) {
        this.facultyID = facultyID;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }





    public  void  getFacultyMemberDetails(){

    }

    public void  updateSalary(float newSalary){
        salary= newSalary;
    }


}
