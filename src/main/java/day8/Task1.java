package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        long time = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - time);
        String s = "";
        for (int i = 0; i < 2000; i++) {
            s = s + i + " ";
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - time);
    }

}
