package Cars;

public class Sedan extends Car {

    double length;

    public Sedan(String color, double length) {
        super(color);
        this.length = length;
    }

    public void describe (){
        System.out.println("describe sedan start");
        super.describe();
        System.out.println("Sedan is: " + color + " and: " + length + "m long");
        System.out.println("describe sedan stop");
    }
}
