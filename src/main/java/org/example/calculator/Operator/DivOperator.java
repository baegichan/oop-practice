package org.example.calculator.Operator;

public class DivOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(Positivenumber operand1, Positivenumber operand2) {
        if(operand2.toInt()==0){
            throw new IllegalArgumentException("0으로 나누는것은 불가능합니다");
        }
        return operand1.toInt()/operand2.toInt();
    }
}
