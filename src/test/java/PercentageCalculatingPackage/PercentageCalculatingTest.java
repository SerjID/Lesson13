package PercentageCalculatingPackage;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PercentageCalculatingTest {
    private static final Double currentDepositValue = 1000.1;
    private static final Double profitValue = 557.12;
    @Test
    static void CurrentDepositValueCalculatingPositiveTest (){
        // Arrange
        final double expected = 1557.22;
        // Act
        final double actual = PercentageCalculating.CurrentDepositValueCalculating(currentDepositValue, profitValue);
        // Assert
        Assertions.assertEquals(expected, actual, 0.01, "Wrong sum Double calculation");
    }
}
