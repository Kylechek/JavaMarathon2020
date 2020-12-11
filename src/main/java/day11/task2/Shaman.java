package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private final double healHimself;
    private final double healTeammate;
    private final int magicAtt;

    public Shaman() {
        this.physAtt = 10;
        this.magicAtt = 15;
        this.physDef = 0.2;
        this.magicDef = 0.2;
        this.healHimself = 50;
        this.healTeammate = 30;
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