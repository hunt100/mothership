package kz.hunt.common;

public enum RollType {
    SIMPLE_ROLL ("%d * [d10]"),
    MULTIPLY_ROLL ("%d * [d10] * 10"),
    PERCENT_ROLL("[d10] + [d10] * 10");

    private final String formula;

    RollType(String formula) {
        this.formula = formula;
    }

    public String getFormula() {
        return formula;
    }
}
