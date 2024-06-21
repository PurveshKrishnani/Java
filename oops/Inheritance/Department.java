package oops.Inheritance;
import java.util.ArrayList;
import java.util.List;

public class Department {

    private List<Student> students;
    private List<FacultyMember> faculty;
    private List<UndergraduateStudent> undergraduateStudents;
    private List<GraduateStudent> graduateStudents;



    public Department() {
        this.students = new ArrayList<>();
        this.faculty = new ArrayList<>();
        this.undergraduateStudents = new ArrayList<>();
        this.graduateStudents = new ArrayList<>();
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


    private List<GraduateStudent> getgraduateStudents() {
        return graduateStudents;
    }

    private List<UndergraduateStudent> getundergraduateStudents() {
        return undergraduateStudents;
    }



    public void addUndergraduateStudent(UndergraduateStudent undergraduateStudent) {
        undergraduateStudents.add(undergraduateStudent);
    }

    public void addGraduateStudent(GraduateStudent graduateStudent) {
        graduateStudents.add(graduateStudent);
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


        UndergraduateStudent student1 = new UndergraduateStudent(101.0, "Purvesh", "digital marketing", 4.2f);
        UndergraduateStudent student2 = new UndergraduateStudent(102.0, "arjun", "hr", 3.8f);

        GraduateStudent student3 = new GraduateStudent(103.0, "hrithick", "actor", 4.0f);
        GraduateStudent student4 = new GraduateStudent(104.0, "roshan", "model", 3.9f);



        department.addUndergraduateStudent(student1);
        department.addUndergraduateStudent(student2);
        department.addGraduateStudent(student3);
        department.addGraduateStudent(student4);

        for (UndergraduateStudent undergraduateStudent :department.getundergraduateStudents()) {
            System.out.println(undergraduateStudent);
        }

        for (GraduateStudent graduateStudent : department.getgraduateStudents()) {
            System.out.println(graduateStudent);
        }


    }



}
