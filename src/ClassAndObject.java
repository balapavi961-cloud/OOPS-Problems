import java.util.Scanner;

public class ClassAndObject {
    public static void studentDetails(int rol, String name,int mark)
    {
        System.out.println("Student Name: "+name);
        System.out.println("Student RollNo: "+rol);
        System.out.println("Student Mark:"+mark);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassAndObject std1 = new ClassAndObject();
        String name = sc.nextLine();
        int rollno = sc.nextInt();
        int mark = sc.nextInt();
        std1.studentDetails(rollno,name,mark);
    }
}
