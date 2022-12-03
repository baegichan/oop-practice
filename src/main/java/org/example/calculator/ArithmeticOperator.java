package org.example.calculator;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADD("+"){
        @Override
        public int arithmeticcalculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    },SUB("-"){
        @Override
        public int arithmeticcalculate(int operand1, int operand2) {
            return operand1-operand2;
        }
    },MUL("*"){
        @Override
        public int arithmeticcalculate(int operand1, int operand2) {
            return operand1* operand2;
        }
    },DIV("/"){
        @Override
        public int arithmeticcalculate(int operand1, int operand2) {
            return operand1/operand2;
        }
    };
    private final String oprator;

    ArithmeticOperator(String operator){
        this.oprator = operator;
    }
    public abstract int arithmeticcalculate(final int operand1,final int operand2);
    public static int calculate(int operand1,String operator,int operand2){
        ArithmeticOperator  arithmeticOpertor = Arrays.stream(values())
                .filter(v -> v.oprator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Illegal Exception"));
        return arithmeticOpertor.arithmeticcalculate(operand1,operand2);

    }
}
