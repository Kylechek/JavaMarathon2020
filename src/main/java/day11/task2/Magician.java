package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician(int physAtt, int magicAtt, double magicDef) {
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
        this.magicDef = magicDef;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setAttHealth(physAtt * (1 - hero.physDef));
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setAttHealth(magicAtt * (1 - hero.magicDef));
    }
}
