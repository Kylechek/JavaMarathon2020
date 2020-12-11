package day11.task2;

public abstract class Hero {
    private double health;
    public  double physDef;
    public double magicDef;
    public int physAtt;

    public Hero() {
        health = 100;
    }

    public double getHealth() {
        return health;
    }

    public void physicalAttack(Hero hero) {
        hero.setAttHealth(physAtt * (1 - hero.physDef));
    }

    public void setAttHealth(double health) {
        for (int i = 0; i < health; i++)
            if (this.health > 0) {
                this.health--;
            }
    }

    public void setHealerHealth(double health) {
        for (int i = 0; i < health; i++)
            if (this.health < 100) {
                this.health++;
            }
    }
}