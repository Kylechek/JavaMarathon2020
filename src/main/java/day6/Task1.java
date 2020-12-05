package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(2010, "Black", "BMW");
        Motorbike mb = new Motorbike(2005, "White", "Honda");
        System.out.println(
                car.info() + " " +
                        car.yearDifference(2020) + " " +
                        mb.info() + " " +
                        mb.yearDifference(2020));
    }
}
