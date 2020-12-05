package day6;


public class Motorbike {
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

    public String info() {
        return "Это мотоцикл";
    }

    public int yearDifference(int year) {
        return year - startYear;
    }
}
