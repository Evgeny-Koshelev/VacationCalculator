package com.calculator.vacationcalculator;

public class CalculatePay {
    public CalculatePay(Integer salary, Integer days){
        this.salary = salary;
        this.days = days;
    }

    private Integer salary;

    private Integer days;


    public Integer gatPay() {
        return salary*days/29;
    }

}
