package Player;

public abstract class Fighter extends Player {

    private FighterType type;

    public Fighter(String name, int healthPoints, int hitPoints, FighterType type) {
        super(name, healthPoints, hitPoints);
        this.type = type;
    }

    public String getPreferredWeapon(){
        return this.type.getPreferredWeapon();
    }

}
