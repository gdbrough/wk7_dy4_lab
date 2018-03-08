package Weapon;

public enum HealingToolsType {
    POTION("potion", -10),
    HERBS("herbs", -5);

    private String name;
    private int healingPoints;

    HealingToolsType(String name, int healingPoints) {
        this.name = name;
        this.healingPoints = healingPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealingPoints() {
        return healingPoints;
    }
}
