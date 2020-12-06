package day6;

public class Car {
        private int startYear;
        private String color;
        private String model;

    public Car(int startYear, String color, String model) {
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

        public String info() {
            return "Это автомобиль";
        }

    public String yearDifference(int year) {
        if (year > startYear) {
            return String.valueOf(year - startYear);
        }
        return "year error";
    }
}
