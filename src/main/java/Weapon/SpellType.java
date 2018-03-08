package Weapon;

public enum SpellType {
    LIGHTNING_STRIKE("lightning strike", 50),
    FIREBALL("fireball", 30);

    private String spellName;
    private int spellHitPoints;

    SpellType(String spellName, int spellHitPoints) {
        this.spellName = spellName;
        this.spellHitPoints = spellHitPoints;
    }

    public String getSpellName() {
        return spellName;
    }

    public int getSpellHitPoints() {
        return spellHitPoints;
    }
}
