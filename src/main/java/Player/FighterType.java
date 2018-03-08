package Player;

public enum FighterType {

    DRAWF("Axe"),
    BARBARIAN("Club"),
    KNIGHT("Sword");


    private String preferedWeapon;

    FighterType(String preferedWeapon) {
        this.preferedWeapon = preferedWeapon;
    }

    public String getPreferredWeapon() {
        return preferedWeapon;
    }

}
