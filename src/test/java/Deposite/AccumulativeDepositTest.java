package Deposite;

import PercentageCalculatingPackage.PercentageCalculating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccumulativeDepositTest {
    private static final Double currentDepositValue = 1000.1;
    private static final Double profitValue = 557.12;
    @Test
    void currentAccumulativeDepositValueCalculating() {
        // Arrange
        final double expected = 1557.22;
        // Act
        final double actual = PercentageCalculating.CurrentDepositValueCalculating(currentDepositValue, profitValue);
        // Assert
        Assertions.assertEquals(expected, actual, 0.01, "Wrong sum Double calculation");
    }
}