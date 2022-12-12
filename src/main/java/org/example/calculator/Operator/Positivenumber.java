package org.example.calculator.Operator;

public class Positivenumber {
    private final int value;
    public Positivenumber(int value){
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        if(isNegative(value)){
            throw new IllegalArgumentException("음수가아닙니다");
        }
    }
    private boolean isNegative(int value) {
        return value <= 0 ;
    }
    public int toInt(){
        return value;
    }

}
