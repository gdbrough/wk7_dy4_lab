package Player;

public abstract class Healer extends Player{

    private HealerType type;

    public Healer(String name, int healthPoints, int hitPoints, HealerType type) {
        super(name, healthPoints, hitPoints);
        this.type = type;
    }

    public String getPreferredHealingTool() {
        return this.type.getPreferredHealingTool();
    }
}
