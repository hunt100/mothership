package kz.hunt.common;

import java.util.ArrayList;
import java.util.List;

public class ThrowResult {
    private Integer finalResult;
    private List<Integer> diceRolls;
    private boolean criticalMiss;
    private boolean criticalHit;
    private boolean success;
    private RollType rollType;

    public ThrowResult() {
        this.finalResult = 0;
        this.diceRolls = new ArrayList<>();
    }

    public Integer getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(Integer finalResult) {
        this.finalResult = finalResult;
    }

    public List<Integer> getDiceRolls() {
        return diceRolls;
    }

    public void setDiceRolls(List<Integer> diceRolls) {
        this.diceRolls = diceRolls;
    }

    public boolean isCriticalMiss() {
        return criticalMiss;
    }

    public void setCriticalMiss(boolean criticalMiss) {
        this.criticalMiss = criticalMiss;
    }

    public boolean isCriticalHit() {
        return criticalHit;
    }

    public void setCriticalHit(boolean criticalHit) {
        this.criticalHit = criticalHit;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public RollType getRollType() {
        return rollType;
    }

    public void setRollType(RollType rollType) {
        this.rollType = rollType;
    }
}
