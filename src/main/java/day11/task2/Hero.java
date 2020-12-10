package day11.task2;

public abstract class Hero {
    private double health;
    public double healHimself;
    public double healTeammate;
    public int physAtt;
    public int magicAtt;
    public double physDef;
    public double magicDef;

    public Hero() {
        health = 100;
    }

    public double getHealth() {
        return health;
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