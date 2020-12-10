package day11.task1;

import java.awt.event.WindowAdapter;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private int count = 0;
    Warehouse w = new Warehouse();

    public Courier(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier: " +
                "salary=" + getSalary() +
                ", count=" + count;
    }

    @Override
    public void doWork() {
        salary += +100;
        count++;
        w.setCountDeliveredOrders(count);
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (count == 10000) {
                salary += +70000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока недоступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
