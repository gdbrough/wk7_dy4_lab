package Player;

import Weapon.MythicalCreatureType;

public abstract class MagicFolk extends Player {

    private MagicFolkType type;
    private MythicalCreatureType creatureType;

    public MagicFolk(String name, int healthPoints, int hitPoints, MagicFolkType type, MythicalCreatureType creatureType) {
        super(name, healthPoints, hitPoints);
        this.type = type;
        this.creatureType = creatureType;
    }

    public String getPreferredSpell(){
        return this.type.getPreferredSpell();
    }

    public String getPreferredCreature() {
        return creatureType.getCreature();
    }
}
