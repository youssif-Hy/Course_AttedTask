
package course_attedtask;
public class Course_AttedTask {
    public static void main(String[] args) {
        Course course = new Course("OOP");
        course.addStudent("Youssef");
        course.addStudent("Ahmed");
        System.out.println("Course Name: " + course.getName());
        System.out.println("Number of Students: " + course.getNumberOfStudents());
    }
    
}
