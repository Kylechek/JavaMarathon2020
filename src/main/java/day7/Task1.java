package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplaneOne = new Airplane("Boeing", 2000, 30, 3);
        Airplane airplaneTwo = new Airplane("Boeing", 2000, 35, 3);
        System.out.println(Airplane.compareAirplanes(airplaneOne, airplaneTwo));
    }
}