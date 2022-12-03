package org.example;

import org.example.calculator.calcul;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/*
 * 목표
 * MVC 패턴 으로 구현
 * 간단한 사칙연산
 * 0으로 나눌경우 IllegalArgument 발생
 */
public class Calculator {
    @DisplayName("덧셈연산을 수행")
    @Test
    void additionTest() {
        int result = calcul.calculate(1, "+", 2);
        assertThat(result).isEqualTo(3);
    }

    @DisplayName("뺄샘연산을 수행")
    @Test
    void subitionTest() {
        int result = calcul.calculate(1, "-", 2);
        assertThat(result).isEqualTo(-1);
    }
    @DisplayName("사칙연산 수행")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculatetest(int operand1,String operator,int operand2,int result) {
        int calresult = calcul.calculate(operand1,operator,result);
        assertThat(result).isEqualTo((result));
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(1,"+",2,3),
                arguments(1,"-",2,-1),
                arguments(4,"*",2,8),
                arguments(4,"/",2,2)
        );

    }
}
