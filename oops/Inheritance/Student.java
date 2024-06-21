package oops.Inheritance;

class Student{

    private  Double studentId;
    private String name;
    private  String department;
    private  Float gpa;


    public Student(Double studentId, String name, String department, Float gpa) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.gpa = gpa;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "student{" +
                " name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", gpa=" + gpa +
                '}';
    }


    public void getInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
    }

    public void updateGPA(float newGPA) {
        gpa = newGPA;
    }

    public  static void main(String args[]){
        Student std = new Student(101.0, "purvesh", "science", 4.2f);
        System.out.println(std);

    }
}
