package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BMW");
        arrayList.add("Mercedes");
        arrayList.add("Honda");
        arrayList.add("BMW");
        arrayList.add("KIA");

        System.out.println(arrayList);
        arrayList.add(2,"Lada");
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
