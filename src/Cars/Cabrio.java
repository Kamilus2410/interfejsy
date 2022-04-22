package Cars;

public class Cabrio extends Car {

        boolean roofopen;

        public Cabrio(String color, boolean roofopen) {
                super(color);
                this.roofopen = roofopen;
        }

        public void describe (){
        System.out.println("describe cabrio start");
        super.describe();
        System.out.println("Cabrio is: " + color + " and roof is open: " + roofopen);
        System.out.println("describe cabrio stop");
    }


}
