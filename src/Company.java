import java.util.Scanner;

class Employee{
    public void name(String name){
        System.out.println("Name : "+name);
    }
    public void id(int id){
        System.out.println("ID : "+id);
    }
    public void salary(double salary){
        System.out.println("Salary :"+salary);
    }
    public void calculateSalary(double salary){
        System.out.println("Annual Salary is : "+salary*12);
    }
}
class Manager extends Employee{
    public void bonus(){
        System.out.println("Your Bom=nus Amount : "+3500);
    }
    public void calculateSalary(double salary){
        System.out.println("Annual Salary is : "+salary*12);
    }
}


public class Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        double salary = sc.nextDouble();
        Manager mg = new Manager();
        mg.name(name);
        mg.id(id);
        mg.salary(salary);
        mg.calculateSalary(salary);
        mg.bonus();
    }
}
