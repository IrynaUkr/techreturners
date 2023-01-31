package week1.day2;

public class Fruit {
    public final String name;

    public final String color;

    public final String countryOfOrigin;

    public Fruit(String name, String color, String countryOfOrigin) {
        this.name = name;
        this.color = color;
        this.countryOfOrigin = countryOfOrigin;
    }

    String getDetails(){
        return "the fruit is " + name + "color is " + "country Of Origin is" + countryOfOrigin;
    }
}
