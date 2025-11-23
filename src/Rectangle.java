import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;
    Rectangle(){
        this.length = 1;
        this.breadth = 1;
    }
    Rectangle(int l , int b){
        this.length = l;
        this.breadth=b;
    }
    public void display(){
        System.out.println("Area of Rectangle : "+length*breadth);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Rectangle rt = new Rectangle();
        Rectangle rtt = new Rectangle(length,breadth);
        rt.display();
        rtt.display();
    }
}
