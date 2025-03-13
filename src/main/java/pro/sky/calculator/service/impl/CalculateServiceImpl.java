package pro.sky.calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.calculator.CalculatorApplication;
import pro.sky.calculator.exception.ExceptionDivideByZero;
import pro.sky.calculator.service.CalculatorService;

@Service
public class CalculateServiceImpl implements CalculatorService {


    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны";
        }
        Integer result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;

    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны";
        }
        Integer result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
        public String multiply(Integer num1, Integer num2){
            if (num1 == null || num2 == null) {
                return "Оба аргумента обязательны";
            }
            Integer result = num1 * num2;
            return num1 + " * " + num2 + " = " + result;
        }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new ExceptionDivideByZero("На ноль делить нельзя");
        }
        Integer result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
