package Assignment2.Q3_Student;

public class Exam extends Student {
    private double mark1;
    private double mark2;
    private double mark3;
    public void input_Marks(double mark1, double mark2, double mark3){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    public void display_Results(){
        System.out.println("Mark1: "+mark1);
        System.out.println("Mark2: "+mark2);
        System.out.println("Mark3: "+mark3);
    }
}
