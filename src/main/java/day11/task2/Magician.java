package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private final int physAtt;
    private final int magicAtt;

    public Magician() {
        this.physAtt = 5;
        this.magicAtt = 20;
        this.magicDef = 0.8;
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
