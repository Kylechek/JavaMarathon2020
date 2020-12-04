package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike car = new Motorbike(2015, "White", "Honda");

        System.out.println(car.getStartYear() + car.getColor() + car.getModel());
    }

    static class Motorbike {
        private final int startYear;
        private final String color;
        private final String model;

        public Motorbike(int startYear, String color, String model) {
            this.startYear = startYear;
            this.color = color;
            this.model = model;
        }

        public int getStartYear() {
            return startYear;
        }

        public String getColor() {
            return color;
        }

        public String getModel() {
            return model;
        }
    }
}
