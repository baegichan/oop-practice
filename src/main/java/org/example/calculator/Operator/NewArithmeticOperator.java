package org.example.calculator.Operator;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculate(Positivenumber operand1,Positivenumber operand2);
}
