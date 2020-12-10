package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private int count;
    Warehouse w = new Warehouse();

    public Picker( Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Picker: " +
                "salary= " + salary +
                ", count= " + count;
    }

    @Override
    public void doWork() {
        salary += 80;
        count++;
        w.setCountPickedOrders(count);
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (count == 10000) {
                salary += +50000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока недоступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
