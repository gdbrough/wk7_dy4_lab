package Weapon;

public enum WeaponType {
    SWORD("sword", 5),
    AXE("axe", 3),
    HAMMER("hammer", 4),
    CLUB("club", 2);

    private String name;
    private int weaponHitPoints;

    WeaponType(String name, int weaponHitPoints) {
        this.name = name;
        this.weaponHitPoints = weaponHitPoints;
    }

    public String getName() {
        return name;
    }

    public int getBonusPoints() {
        return weaponHitPoints;
    }
}
