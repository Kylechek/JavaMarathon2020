package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Black");
        car.setModel("BMW");
        car.setStartYear(2010);

        System.out.println(car.getStartYear() + car.getColor() + car.getModel());
    }

    static class Car {
        private int StartYear;
        private String Color;
        private String Model;

        public void setStartYear(int startYear) {
            StartYear = startYear;
        }

        public void setColor(String color) {
            Color = color;
        }

        public void setModel(String model) {
            Model = model;
        }

        public int getStartYear() {
            return StartYear;
        }

        public String getColor() {
            return Color;
        }

        public String getModel() {
            return Model;
        }
    }
}
