package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000, 30, 3);
        airplane.setLength(35);
        airplane.setYear(4);

        airplane.fillUp(200);
        System.out.println(airplane.info());

    }

    static class Airplane {
        private String producer;
        private int year;
        private int length;
        private int weight;
        private int fuel;

        public Airplane(String producer, int year, int length, int weight) {
            this.producer = producer;
            this.year = year;
            this.length = length;
            this.weight = weight;
            setFuel(0);
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        public int getFuel() {
            return fuel;
        }

        public String info() {
            return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight
                    + " , количество топлива в баке: " + getFuel();
        }

        public void fillUp(int fuel) {
            for (int i = 0; i <= fuel; i++) {
                setFuel(i++);
            }
        }
    }
}