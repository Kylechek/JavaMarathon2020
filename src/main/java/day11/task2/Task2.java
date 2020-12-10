package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(30, 0.8);
        Paladin paladin = new Paladin(15, 0.5, 0.2, 25, 10);
        Magician magician = new Magician(5, 20, 0.8);
        Shaman shaman = new Shaman(10, 15, 0.2, 0.2, 50, 30);

        warrior.physicalAttack(paladin);
        System.out.println(paladin.getHealth());
        paladin.physicalAttack(magician);
        System.out.println(magician.getHealth());
        shaman.healTeammate(magician);
        System.out.println(magician.getHealth());
        magician.magicalAttack(paladin);
        System.out.println(paladin.getHealth());
        shaman.physicalAttack(warrior);
        System.out.println(warrior.getHealth());
        paladin.healHimself();
        System.out.println(paladin.getHealth());

        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician.getHealth());
        }
    }
}
