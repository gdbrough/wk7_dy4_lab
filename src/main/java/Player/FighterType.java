package Player;

public enum FighterType {

    DRAWF("axe"),
    BARBARIAN("club"),
    KNIGHT("sword");


    private String preferedWeapon;

    FighterType(String preferedWeapon) {
        this.preferedWeapon = preferedWeapon;
    }

    public String getPreferredWeapon() {
        return preferedWeapon;
    }

}
