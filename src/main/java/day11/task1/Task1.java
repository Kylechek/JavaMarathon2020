package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse wh1 = new Warehouse();
        Warehouse wh2 = new Warehouse();
        Picker pickerOne = new Picker(wh1);
        Picker pickerTwo = new Picker(wh2);
        Courier courierOne = new Courier(wh1);
        Courier courierTwo = new Courier(wh2);

        businessProcess(pickerOne);
        businessProcess(courierOne);

        pickerTwo.doWork();
        courierTwo.doWork();

        System.out.println(pickerOne.toString());
        System.out.println(courierOne.toString());
        System.out.println(wh1.toString());

        System.out.println(pickerTwo.toString());
        System.out.println(courierTwo.toString());
        System.out.println(wh2.toString());

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
