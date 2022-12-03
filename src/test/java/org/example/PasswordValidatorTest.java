package org.example;

import org.example.passwd.PasswordValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/*
        목표
 #비밀번호 최소 8자 이상 12자이하로 구성할예정이다
 #비밀번호가 8자 미만 또는 12자 초과인 경우 예외를 발생시킨다
 #경계값 분석 테스트를 할 예정이다
 */


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class PasswordValidatorTest {
    @DisplayName("비밀번호가 최소 8자 이상 12자이하면 예외가 발생안한다")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("password"))
                .doesNotThrowAnyException();;
    }
    @DisplayName("비밀번호가 8자 미만 또는 12자초과하는경우 IllegalArgumentException 발생")
    @ParameterizedTest
    @ValueSource(strings = {"1234567", "1234567890123"})
    void validatePasswordTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
            .isInstanceOf(IllegalArgumentException.class).hasMessage("비밀번호는 최소 8자이상 12자 이하여야한다.");

    }
}
