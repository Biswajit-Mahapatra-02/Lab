package A3Q3;

public class Student {
    private final String name;
    private final int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    public void display(){
        System.out.println("Name: "+name+"\nMark: "+marks);
    }
}
