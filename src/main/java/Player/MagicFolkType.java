package Player;

public enum MagicFolkType {
    WIZARD("Lightning Strike", MythicalCreatureType.DRAGON),
    WARLOCK("Fireball", MythicalCreatureType.ORGE);

    private String preferredSpell;
    private MythicalCreatureType preferredCreature;


    MagicFolkType(String preferredSpell, MythicalCreatureType preferredCreature) {
        this.preferredSpell = preferredSpell;
        this.preferredCreature = preferredCreature;
    }

    public String getPreferredSpell() {
        return preferredSpell;
    }

    public MythicalCreatureType getPreferredCreature() {
        return preferredCreature;
    }
}
