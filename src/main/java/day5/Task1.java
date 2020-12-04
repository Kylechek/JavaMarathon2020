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
        private int startYear;
        private String color;
        private String model;

        public void setStartYear(int startYear) {
            this.startYear = startYear;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setModel(String model) {
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
