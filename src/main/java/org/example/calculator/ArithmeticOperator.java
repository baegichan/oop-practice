package org.example.calculator;

import org.example.calculator.Operator.Positivenumber;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADD("+"){
        @Override
        public int arithmeticcalculate(Positivenumber operand1, Positivenumber operand2) {
            return operand1.toInt() + operand2.toInt();
        }
    },SUB("-"){
        @Override
        public int arithmeticcalculate(Positivenumber operand1, Positivenumber operand2) {
            return operand1.toInt()-operand2.toInt();
        }
    },MUL("*"){
        @Override
        public int arithmeticcalculate(Positivenumber operand1, Positivenumber operand2) {
            return operand1.toInt()* operand2.toInt();
        }
    },DIV("/"){
        @Override
        public int arithmeticcalculate(Positivenumber operand1, Positivenumber operand2) {
            return operand1.toInt()/operand2.toInt();
        }
    };
    private final String oprator;

    ArithmeticOperator(String operator){
        this.oprator = operator;
    }
    public abstract int arithmeticcalculate(final Positivenumber operand1,final Positivenumber operand2);
    public static int calculate(Positivenumber operand1, String operator, Positivenumber operand2){
        ArithmeticOperator  arithmeticOpertor = Arrays.stream(values())
                .filter(v -> v.oprator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Illegal Exception"));
        return arithmeticOpertor.arithmeticcalculate(operand1,operand2);

    }
}
