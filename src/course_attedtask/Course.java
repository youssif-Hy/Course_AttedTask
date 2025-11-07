package course_attedtask;
public class Course {
    private String name;
    private String [] students;
    private int numberOfStudents;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    
    public void addStudent(String student) {
        if(student !="" || student !=null){
            if (students == null) {
                students = new String[1];
            } else if (numberOfStudents >= students.length) {
                String[] newStudents = new String[students.length * 2];
                System.arraycopy(students, 0, newStudents, 0, students.length);
                students = newStudents;
            }
            students[numberOfStudents] = student;
            numberOfStudents++;
        }
        else{
            System.out.println("Invalid student name");
        }
    }
}
