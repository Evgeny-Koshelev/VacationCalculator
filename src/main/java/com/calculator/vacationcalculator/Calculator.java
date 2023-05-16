package com.calculator.vacationcalculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {


    CalculatePay calculatePay;

    @GetMapping("/calculate")
    public Integer getCalculator(@RequestParam(value = "midSalary", defaultValue = "0") Integer midSalary,
                                 @RequestParam(value = "days", defaultValue = "0") Integer days){
        Integer pay =0;
        if(midSalary != null && days!=null){
            calculatePay = new CalculatePay(midSalary,days);
            pay = calculatePay.gatPay();


        }
        return  pay;

    }
}
