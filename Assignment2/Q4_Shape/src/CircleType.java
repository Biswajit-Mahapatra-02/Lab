package Q4_Shape.src;


public class CircleType extends PointType{
    private PointType center;
    private double radius;

    public void setCenter(double x, double y) {
        center = new PointType();
        center.setPoint(x,y);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void showRadius(){
        System.out.println("Radius: "+radius);
    }

    public PointType circlePosition(){
        return center;
    }
    public double circleArea(){
        return Math.PI*radius*radius;
    }
}
