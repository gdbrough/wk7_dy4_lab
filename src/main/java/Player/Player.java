package Player;

public abstract class Player {

    private String name;
    private int healthPoints;
    private int hitPoints;

    public Player(String name, int healthPoints, int hitPoints) {
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

}
