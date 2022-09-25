package kz.hunt.common;

public enum SituationType {
    ADVANTAGE("[+]", 2),
    DISADVANTAGE("[-]", 2),
    NONE("", 1);

    private final String symbolNotation;
    private final int numberOfRolls;

    SituationType(String symbolNotation, int numberOfRolls) {
        this.symbolNotation = symbolNotation;
        this.numberOfRolls = numberOfRolls;
    }

    public String getSymbolNotation() {
        return symbolNotation;
    }

    public int getNumberOfRolls() {
        return numberOfRolls;
    }
}
