package Cars;

public class Car {
    public String color;

    public Car(String color) {
        this.color = color;
    }

    public void describe(){
        System.out.println("Car is: " + color);
    }


}
