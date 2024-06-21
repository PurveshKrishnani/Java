package oops.Inheritance;
import java.util.ArrayList;
import java.util.List;

public class Department {

    private List<Student> students;
    private List<FacultyMember> faculty;

    public Department() {
        this.students = new ArrayList<>();
        this.faculty = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addfaculty(FacultyMember facultyMember) {
        faculty.add(facultyMember);
    }

    public List<Student> getStudents() {
        return students;
    }

    private List<FacultyMember> getfaculty() {

        return faculty;
    }
    public static void main(String args[])
    {

        Department department = new Department();
        Student std = new Student(101.0d, "puru", "java developer", 4.0f);
        Student std1 = new Student(102.0d, "puru", "java developer", 4.0f);
        Student std2 = new Student(103.0d, "puru", "java developer", 4.0f);

        department.addStudent(std);
        department.addStudent(std1);
        department.addStudent(std2);

        FacultyMember  faculty = new FacultyMember(201, "chirag" , "devops" ,10000f);
        FacultyMember  faculty1 = new FacultyMember(202, "chirag" , "devops" ,10000f);
        FacultyMember  faculty2 = new FacultyMember(203, "chirag" , "devops" ,10000f);

        department.addfaculty(faculty);
        department.addfaculty(faculty1);
        department.addfaculty(faculty2);


        for (Student student : department.getStudents()) {
            System.out.println(student);
        }

        for (FacultyMember facultyMember : department.getfaculty()) {
            System.out.println(facultyMember);
        }
    }
}
