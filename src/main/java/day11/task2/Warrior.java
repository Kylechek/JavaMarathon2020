package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior(int physAtt, double physDef) {
        this.physAtt = physAtt;
        this.physDef = physDef;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setAttHealth(physAtt * (1 - hero.physDef));
    }
}