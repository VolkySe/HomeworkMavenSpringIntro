package pro.sky.calculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParameterizedTest {
    private final CalculateServiceImpl calculateService = new CalculateServiceImpl();

    private static Stream<Arguments> argumentProvider() {

        return Stream.of(
                Arguments.of(10, 20),
                Arguments.of(-10, -20),
                Arguments.of(100, 200),
                Arguments.of(100000000, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void plusTest(int num1, int num2) {
        //given

        String expectedResult = num1 + " + " + num2 + " = " + (num1 + num2);
        //when
        String actualResult = calculateService.plus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void minusTest(int num1, int num2) {
        String expectedResult = num1 + " - " + num2 + " = " + (num1 - num2);
        String actualResult = calculateService.minus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void multiplyTest(int num1, int num2) {
        String expectedResult = num1 + " * " + num2 + " = " + (num1 * num2);
        String actualResult = calculateService.multiply(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void divideTest(int num1, int num2) {
        String expectedResult = num1 + " / " + num2 + " = " + (num1 / num2);
        String actualResult = calculateService.divide(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
