package pro.sky.calculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.exception.ExceptionDivideByZero;

class CalculateServiceImplTest {

    private final CalculateServiceImpl calculateService = new CalculateServiceImpl();

    @Test
    void plus() {
        //given
        Integer num1 = 10;
        Integer num2 = 5;
        String expectedResult = num1 + " + " + num2 + " = " + (num1 + num2);
        //when
        String actualResult = calculateService.plus(num1, num2);
        //then
        Assertions.assertEquals(expectedResult, actualResult);

        //given
        num1 = -10;
        num2 = -5;
        expectedResult = num1 + " + " + num2 + " = " + (num1 + num2);
        //when
        actualResult = calculateService.plus(num1, num2);
        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void minus() {
        //given
        Integer num1 = 10;
        Integer num2 = 5;
        String expectedResult = num1 + " - " + num2 + " = " + (num1 - num2);
        //when
        String actualResult = calculateService.minus(num1, num2);
        //then
        Assertions.assertEquals(expectedResult, actualResult);

        //given
        num1 = -10;
        num2 = -5;
        expectedResult = num1 + " - " + num2 + " = " + (num1 - num2);
        //when
        actualResult = calculateService.minus(num1, num2);
        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void multiply() {
        //given
        Integer num1 = 10;
        Integer num2 = 5;
        String expectedResult = num1 + " * " + num2 + " = " + (num1 * num2);
        //when
        String actualResult = calculateService.multiply(num1, num2);
        //then
        Assertions.assertEquals(expectedResult, actualResult);

        //given
        num1 = -10;
        num2 = -5;
        expectedResult = num1 + " * " + num2 + " = " + (num1 * num2);
        //when
        actualResult = calculateService.multiply(num1, num2);
        //then
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void divide() {
//given
        Integer num1 = 10;
        Integer num2 = 5;
        String expectedResult = num1 + " / " + num2 + " = " + (num1 / num2);
        //when
        String actualResult = calculateService.divide(num1, num2);
        //then
        Assertions.assertEquals(expectedResult, actualResult);

        //given
        num1 = -10;
        num2 = -5;
        expectedResult = num1 + " / " + num2 + " = " + (num1 / num2);
        //when
        actualResult = calculateService.divide(num1, num2);
        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldThrowExceptionWhenSecondArgIsZero() {
        //given
        Integer num1 = 25;
        Integer num2 = 0;
        //when
        //then
        Assertions.assertThrows(
                ExceptionDivideByZero.class,
                () -> calculateService.divide(num1, num2)
        );
    }
}