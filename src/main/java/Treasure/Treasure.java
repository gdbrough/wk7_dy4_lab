package Treasure;

public class Treasure {

    private String name;
    private int amount;
    private int value;

    public Treasure(String name, int amount, int value) {
        this.name = name;
        this.amount = amount;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getValue() {
        return value;
    }
}
