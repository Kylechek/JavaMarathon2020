package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public Warehouse() {

    }

    public void setCountPickedOrders(int countPickedOrders) {
        for (int i = 0; i < countPickedOrders; i++) {
            this.countPickedOrders++;
        }
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        for (int i = 0; i < countDeliveredOrders; i++) {
            this.countDeliveredOrders++;
        }
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Warehouse: " +
                "Picked orders= " + countPickedOrders +
                ", Delivered orders= " + countDeliveredOrders;
    }
}
