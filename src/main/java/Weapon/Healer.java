package Weapon;

public abstract class Healer {

    private HealingToolsType type;

    public Healer(HealingToolsType type) {
        this.type = type;
    }

    public String getName(){
        return this.type.getName();
    }

    public int getHealingPoints(){
        return this.type.getHealingPoints();
    }
}
