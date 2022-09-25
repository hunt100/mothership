package kz.hunt.common;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public final class RollUtils {

    private static SecureRandom rn = new SecureRandom();

    private RollUtils() {
    }

    public static ThrowResult rollSimple(int numberOfDice, SituationType situationType) {
        List<ThrowResult> throwResultList = new ArrayList<>();
        for (int i = 0; i < situationType.getNumberOfRolls(); i++) {
            ThrowResult iThrow = new ThrowResult();
            iThrow.setRollType(RollType.SIMPLE_ROLL);
            for (int j = 0; j < numberOfDice; j++) {
                int rollResult = rn.nextInt(10) + 1;
                iThrow.getDiceRolls().add(rollResult);
                iThrow.setFinalResult(iThrow.getFinalResult() + rollResult);
            }
            throwResultList.add(iThrow);
        }

        Stream<ThrowResult> sorted = throwResultList.stream();
        Comparator<ThrowResult> comparator = Comparator.comparingInt(ThrowResult::getFinalResult);
        Optional<ThrowResult> result = SituationType.DISADVANTAGE == situationType ? sorted.min(comparator) : sorted.max(comparator);
        return result.orElseThrow();
    }

    public static ThrowResult rollCharacteristicCheck(int attrValue, SituationType situationType) {
        return rollPercent(attrValue, situationType);
    }

    public static ThrowResult rollSave(int attrValue, SituationType situationType) {
        return rollPercent(attrValue, situationType);
    }

    private static ThrowResult rollPercent(int attrValue, SituationType situationType) {
        List<ThrowResult> throwResultList = new ArrayList<>();
        for (int i = 0; i < situationType.getNumberOfRolls(); i++) {
            ThrowResult iThrow = new ThrowResult();
            iThrow.setRollType(RollType.PERCENT_ROLL);
            int ones = rn.nextInt(10);
            int tens = rn.nextInt(10);
            int finalRes = ones + tens * 10;
            boolean equality = ones == tens;
            iThrow.setSuccess(finalRes <= attrValue);
            iThrow.setCriticalHit(iThrow.isSuccess() && equality);
            iThrow.setCriticalMiss(!iThrow.isSuccess() && equality);
            iThrow.setFinalResult(finalRes);
            iThrow.getDiceRolls().add(finalRes);
            throwResultList.add(iThrow);
        }

        Stream<ThrowResult> sorted = throwResultList.stream();
        Comparator<ThrowResult> comparator = Comparator.comparingInt(ThrowResult::getFinalResult);
        Optional<ThrowResult> result = SituationType.ADVANTAGE == situationType ? sorted.min(comparator) : sorted.max(comparator);
        return result.orElseThrow();
    }
}
