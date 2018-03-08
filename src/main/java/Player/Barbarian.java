package Player;

import Weapon.WeaponType;

public class Barbarian extends Fighter {
    public Barbarian(String name, int healthPoints, int hitPoints, FighterType type, WeaponType currentWeaponType) {
        super(name, healthPoints, hitPoints, type, currentWeaponType);
    }

}
