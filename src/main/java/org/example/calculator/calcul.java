package org.example.calculator;

import org.example.calculator.Operator.*;


import java.util.List;

public class calcul {
    private static final List<NewArithmeticOperator> arithmeticOperator = List.of(new AdditionOperator(), new SubOperator(), new MulOperator(),new DivOperator());

    public static int calculate(Positivenumber operand1, String oper, Positivenumber operand2) {
        return arithmeticOperator.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(oper))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("사칙연산 오류"));
        //return ArithmeticOperator.calculate(operand1,oper,operand2);
    }
}
