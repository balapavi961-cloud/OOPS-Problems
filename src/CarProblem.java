public class CarProblem {
    public void start(){
        System.out.println("The Car Sales is Starting.....");
    }
    public void stop(){
        System.out.println("The Car Sales was Stoped..");
    }
    public void details(){
        String brand = "BMW";
        String model = "bmw88";
        int year = 1978;
        System.out.println("Brand :"+brand);
        System.out.println("Model :"+model);
        System.out.println("Year :"+year);
    }
    public static void main(String[] args) {

        CarProblem car1 = new CarProblem();
        car1.details();
        //car1.start();
        car1.stop();
    }
}
