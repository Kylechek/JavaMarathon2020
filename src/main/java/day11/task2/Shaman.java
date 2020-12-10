package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    public Shaman(int physAtt, int magicAtt, double physDef, double magicDef, double healHimself, double healTeammate) {
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.healHimself = healHimself;
        this.healTeammate = healTeammate;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setAttHealth(physAtt * (1 - hero.physDef));
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setAttHealth(magicAtt * (1 - hero.magicDef));
    }

    @Override
    public void healHimself() {
        setHealerHealth(healHimself);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealerHealth(healTeammate);
    }
}