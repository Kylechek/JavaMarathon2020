package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private final double healHimself;
    private final double healTeammate;
    public int physAtt;

    public Paladin() {
        this.physAtt = 15;
        this.physDef = 0.5;
        this.magicDef = 0.2;
        this.healHimself = 25;
        this.healTeammate = 10;
    }

    @Override
    public void healHimself() {
        setHealerHealth(healHimself);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealerHealth(healTeammate);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setAttHealth(physAtt * (1 - hero.physDef));
    }
}