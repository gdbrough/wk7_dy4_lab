package Weapon;

public abstract class MagicFolk {

    private MythicalCreatureType type;
    private SpellType spellType;

    public MagicFolk(MythicalCreatureType type, SpellType spellType) {
        this.type = type;
        this.spellType = spellType;
    }

    public String getCreature(){
        return this.type.getCreature();
    }

    public int getBonusPoints(){
        return this.type.getBonusPoints();
    }

    public String getSpellName() {
        return spellType.getSpellName();
    }

    public int getSpellHitPoints(){
        return spellType.getSpellHitPoints();
    }

}
