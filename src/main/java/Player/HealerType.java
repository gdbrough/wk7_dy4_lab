package Player;

public enum HealerType {
    CLERIC("potion");

    private String preferredHealingTool;

    HealerType(String preferredHealingTool) {
        this.preferredHealingTool = preferredHealingTool;
    }

    public String getPreferredHealingTool() {
        return preferredHealingTool;
    }
}
