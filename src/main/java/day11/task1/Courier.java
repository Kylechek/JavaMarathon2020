package day11.task1;

public class Courier implements Worker {
    private int salary;
    private int count;
    private boolean isPayed;
    private final Warehouse w;

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
                ", count= " + count;
    }

    @Override
    public void doWork() {
        salary += 100;
        count++;
        w.setCountDeliveredOrders(+1);
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
