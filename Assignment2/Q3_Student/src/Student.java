package Q3_Student.src;

public class Student{
    private long rollNo;
    private String name;
    private String course;
    public void input_Student(long rollNo, String name, String course){
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }
    public void display_Student(){
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+rollNo);
        System.out.println("Course: "+course);
    }
}