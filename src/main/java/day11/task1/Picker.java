package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private int count;
    private final Warehouse w;

    public Picker( Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
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
        w.setCountPickedOrders(+1);
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (count == 10000) {
                salary += 70000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
