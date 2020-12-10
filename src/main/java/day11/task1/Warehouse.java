package day11.task1;

public class Warehouse{
    private int countPickedOrders;
    private int countDeliveredOrders;

    public Warehouse() {

    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
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
                ", Delivered orders= " +  countDeliveredOrders;
    }
}
