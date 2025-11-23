abstract  class Appliance{
    abstract void turnOn();
    public void plugin(){
        System.out.println("System is pluged in");
    }
}
class Computer extends Appliance{
    public void turnOn(){
        System.out.println("System was turned on");
    }
    void display(){
        super.plugin();
    }
}
public class Appliances {
    public static void main(String[] args) {
        Computer cs = new Computer();
        cs.turnOn();
        cs.display();
    }
}
