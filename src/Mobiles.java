public class Mobiles {
    void Price(int p){
        System.out.println("  "+p);
    }
    void color(String c){
        System.out.println("  "+c);
    }
    void model(String s){
        System.out.println("  "+s);
    }
    public static void main(String[] args) {
        Mobiles oppo = new Mobiles();
        Mobiles redmi = new Mobiles();
        System.out.println("OPPO MOBILE:");
        oppo.Price(21000);
        oppo.color("Golden Cristal");
        oppo.model("A59 5G");
        System.out.println("REDMI MOBILE:");
        redmi.Price(25000);
        redmi.color("navy");
        redmi.model("mi57 Pro 5G");
    }
}
