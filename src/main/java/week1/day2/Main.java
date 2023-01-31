package week1.day2;

public class Main {
    public static void main(String[] args) {
        Lemon lemon = new Lemon("lemon"," green","Turkey");
        Orange orange = new Orange("orange", " yellow", "Egypt");
        System.out.println(lemon.getDetails());
        System.out.println(orange.getDetails());
    }
}
