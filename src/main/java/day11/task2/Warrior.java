package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    public int physAtt;

    public Warrior() {
        this.physAtt = 30;
        this.physDef = 0.8;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setAttHealth(physAtt * (1 - hero.physDef));
    }
}