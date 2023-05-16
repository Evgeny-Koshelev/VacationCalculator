package com.calculator.vacationcalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CalculatorTest {

    @Test
    void getCalculator(){
        Calculator calculator = new Calculator();
        int pay;
        int checkPay = 40000;
        pay = calculator.getCalculator(58000,20);
        assertEquals(checkPay,pay);

    }
}
