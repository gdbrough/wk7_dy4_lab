package Player;

import Enemy.Enemy;
import Weapon.WeaponType;

public abstract class Fighter extends Player {

    private FighterType type;
    private WeaponType currentWeaponType;

    public Fighter(String name, int healthPoints, int hitPoints, FighterType type, WeaponType currentWeaponType) {
        super(name, healthPoints, hitPoints);
        this.type = type;
        this.currentWeaponType = currentWeaponType;
    }

    public String getPreferredWeapon(){
        return this.type.getPreferredWeapon();
    }

    public WeaponType getCurrentWeapon() {
        return this.currentWeaponType;
    }

    public void setCurrentWeaponType(WeaponType currentWeaponType) {
        this.currentWeaponType = currentWeaponType;
    }

    public void attack(Enemy enemy){
        int attackPoints = getHitPoints();
        if (getCurrentWeapon().getName() == getPreferredWeapon()) {
            attackPoints += getCurrentWeapon().getBonusPoints();
        }
        enemy.setHealthPoints(enemy.getHealthPoints() - attackPoints);
    }
}
