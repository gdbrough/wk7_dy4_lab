package Weapon;

public abstract class Fighter {

    private WeaponType type;

    public Fighter(WeaponType type) {
        this.type = type;
    }

    public String getName(){
        return this.type.getName();
    }

    public int getBonusPoints(){
        return this.type.getBonusPoints();
    }
}
