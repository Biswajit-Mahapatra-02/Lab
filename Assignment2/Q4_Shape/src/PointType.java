public class PointType {
    private double x;
    private double y;
    public void setPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void showPoint(){
        System.out.println("("+x+","+y+")");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
