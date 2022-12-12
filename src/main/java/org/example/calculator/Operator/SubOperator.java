package org.example.calculator.Operator;

public class SubOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "-".equals(operator);
    }

    @Override
    public int calculate(Positivenumber operand1, Positivenumber operand2) {
        return operand1.toInt() - operand2.toInt();
    }
}
