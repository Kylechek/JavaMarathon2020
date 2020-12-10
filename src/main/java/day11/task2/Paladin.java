package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    public Paladin(int physAtt, double physDef, double magicDef, double healHimself, double healTeammate) {
        this.physAtt = physAtt;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.healHimself = healHimself;
        this.healTeammate = healTeammate;
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