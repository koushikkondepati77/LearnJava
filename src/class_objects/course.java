package class_objects;

public class course{
    String courseName;
    String studentName;
    int enrollments;
    String[] enrolledStudents = new String[maxCapacity];
    static int maxCapacity = 100;


    public void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;

    }

    public void unenrollStudent(String studentName){

    }

    public static void setMaxCapacity(int maxCapacity){
        course.maxCapacity = maxCapacity;
    }

    public static int getMaxCapacity(){
        return maxCapacity;
    }

    course(String courseName){

        this.courseName = courseName;
        this.enrollments = 0;

    }

    public static void main(String[] args){
        course stu1 = new course("java");
        course stu2 = new course("python");
        System.out.println(course.getMaxCapacity());
        stu1.enrollStudent("koushik");
    }
}
