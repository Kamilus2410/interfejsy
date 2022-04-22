import Cars.Cabrio;
import Cars.Car;
import Cars.Sedan;

public class Main {
    public static void main(String[] args) {
        Cat kotek = new Cat();
        kotek.beStroked();
        kotek.doSmth();
        System.out.println(kotek.gimmeVoice());
        kotek.sing("Marcuje");
        System.out.println();
        Cabrio kabriolet = new Cabrio("niebieski", true);
        Sedan sedanik = new Sedan("czerwony", 4.9);
        kabriolet.describe();
        sedanik.describe();
        Car kabriolet2 = new Cabrio("niebieski", true); //wywołuje metode z dziecka jezeli sa zdefiniowane kontruktory
        Car sedanik2 = new Sedan("czerwony", 4.9);
        kabriolet2.describe();
        sedanik2.describe();
        System.out.println();
        System.out.println();

        Car[] arr = new Car[1000];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = new Cabrio("blue", i % 4 == 0);
            } else {
                arr[i] = new Sedan("red", 1 + (double)i/100);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("petelka " + i);
            arr[i].describe();

        }


    }
}
