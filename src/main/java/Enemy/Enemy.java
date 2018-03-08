package Enemy;

import Player.Player;

public abstract class Enemy {

    private String name;
    private int healthPoints;
    private int hitPoints;

    public Enemy(String name, int healthPoints, int hitPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void attack(Player player){
        player.setHealthPoints(player.getHealthPoints() - getHitPoints());
    }
}
