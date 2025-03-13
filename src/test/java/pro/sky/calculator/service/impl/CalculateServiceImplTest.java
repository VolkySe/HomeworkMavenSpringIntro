package pro.sky.calculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.exception.ExceptionDivideByZero;

import static org.junit.jupiter.api.Assertions.*;

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
        ////num1 = 25;
        ////num2 = 5;
        ////expectedResult = 30;
        //when
        ////actualResult = calculateService.plus(num1, num2);
        //then
        ////Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus() {
        //given
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 5;
        //when
        ////Integer actualResult = calculateService.minus(num1, num2);
        //then
        ////Assertions.assertEquals(expectedResult, actualResult);

        //given
        num1 = 25;
        num2 = 5;
        expectedResult = 20;
        //when
        ////actualResult = calculateService.minus(num1, num2);
        //then
        ////Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply() {
        //given
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 50;
        //when
        ////Integer actualResult = calculateService.multiply(num1, num2);
        //then
        ////Assertions.assertEquals(expectedResult, actualResult);

        //given
        num1 = 25;
        num2 = 5;
        expectedResult = 125;
        //when
        ////actualResult = calculateService.multiply(num1, num2);
        //then
        ////Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    void divide() {
        //given
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 2;
        //when
        ////Integer actualResult = calculateService.divide(num1, num2);
        //then
        ////Assertions.assertEquals(expectedResult, actualResult);

        //given
        num1 = 25;
        num2 = 5;
        expectedResult = 5;
        //when
        ////actualResult = calculateService.divide(num1, num2);
        //then
        ////Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldThrowExceptionWhenSecondArgIsZero() {
        //given
        int num1 = 25;
        int num2 = 0;
        //when
        //then
        ////Assertions.assertThrows(
        ////        ExceptionDivideByZero.class,
        ////        () -> calculateService.divide(num1, num2)
        ////);
    }
}