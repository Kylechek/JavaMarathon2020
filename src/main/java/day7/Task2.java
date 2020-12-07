package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt((Player.MAX_STAMINA - Player.MIN_STAMINA) + 1) + Player.MIN_STAMINA;
        Player player1 = new Player(randomNumber);
        Player player2 = new Player(randomNumber);
        Player player3 = new Player(randomNumber);
        Player player4 = new Player(randomNumber);
        Player player5 = new Player(randomNumber);
        Player player6 = new Player(randomNumber);
        System.out.println(Player.info());
        Player player7 = new Player(randomNumber);
        Player player8 = new Player(randomNumber);
        System.out.println(Player.info());
        while (player6.getStamina() != 0) {
            player6.run();
        }
        System.out.println(Player.info());
        while (player5.getStamina() != 0) {
            player5.run();
        }
        System.out.println(Player.info());
    }
}

class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static String info() {
        if (countPlayers < 6) {
            return ("Команды не полные. На поле еще есть " + (6 - getCountPlayers()) + " свободных мест");
        }
        return "На поле нет свободных мест";
    }
}