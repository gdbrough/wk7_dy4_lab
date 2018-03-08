package Player;

import Weapon.WeaponType;

public class Knight extends Fighter {

    public Knight(String name, int healthPoints, int hitPoints, FighterType type, WeaponType currentWeaponType) {
        super(name, healthPoints, hitPoints, type, currentWeaponType);
    }
}
