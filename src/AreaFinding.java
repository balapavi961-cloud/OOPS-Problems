import java.util.Scanner;
class Shape{
    public void area(){
        System.out.println("Area of the shapes");
    }
}
class Circle extends  Shape{
    double r;
    Circle(double radius){
        this.r=radius;
    }
    public void area(){
        double result =Math.PI*r*r;
        System.out.println("Area of Circle:"+result);
    }
}
public class AreaFinding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.area();

    }
}
