package Weapon;

public enum MythicalCreatureType {
    DRAGON("dragon", 15),
    ORGE("ogre", 10);

    private String creature;
    private int defencePoints;

    MythicalCreatureType(String creature, int defencePoints) {
        this.creature = creature;
        this.defencePoints = defencePoints;
    }

    public String getCreature() {
        return creature;
    }

    public int getBonusPoints() {
        return defencePoints;
    }
}
