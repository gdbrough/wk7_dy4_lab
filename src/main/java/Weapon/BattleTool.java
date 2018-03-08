package Weapon;

public abstract class BattleTool {

    private WeaponType type;

    public BattleTool(WeaponType type) {
        this.type = type;
    }

    public String getName(){
        return this.type.getName();
    }

    public int getBonusPoints(){
        return this.type.getBonusPoints();
    }
}
