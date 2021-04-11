import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A special test case")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        //Arrange
        calculator = new Calculator(-100, 100);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test finished");
    }

    @Test
    public void addTwoPlusThree() {

        //Act
        int result = calculator.add(2, 3);
        //Assert
        assertEquals(5, result);
    }

    @Test
    public void substractFiveMinusThree() {

        //Act
        int result = calculator.substract(5, 3);
        //Assert
        assertEquals(2, result);
    }

    @Test
    public void substractThreeMinusFive() {
        //Act
        int result = calculator.substract(3, 5);
        //Assert
        assertEquals(-2, result);
    }

    @Test
    void subctractTwoNegativeNumbers() {

        int substract = calculator.substract(-2, -2);
        assertEquals(0, substract);
    }

    @Test
    void multiplyOneByFive() {
        int result = calculator.multiply(1, 5);
        assertEquals(5, result);
    }

    @Test
    void multiplyFiveByTen() {
        int result = calculator.multiply(5, 10);
        assertEquals(50, result);

    }

    @Test
    void multiplyAtleastOneNegative() {
        int result = calculator.multiply(2, -8);
        assertEquals(-16, result);
    }

    @Test
    void multiplyBothNegative() {
        int result = calculator.multiply(-5, -4);
        assertEquals(20, result);
    }

    @Test
    void divideTenByFive() {
        double result = calculator.divide(10, 5);
        assertEquals(2.0, result);
    }

    @Test
    void divideTwentyByFive() {
        double result = calculator.divide(20, 5);
        assertEquals(4, result);

    }

    @Test
    void divideNumberByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));

        assertTrue(exception.getMessage().contains("Zero"));
        assertEquals("Second parameter cannot be Zero", exception.getMessage());


    }

    @Test()
    @DisplayName("Check the limits")
    public void substractExcedingLowerLimit() {

        assertThrows(IllegalArgumentException.class, () -> {
            //Arrange
            Calculator calculator = new Calculator(-100, 100);
            //Act
            int result = calculator.substract(10, 150);
            //Assert


        });

    }

}