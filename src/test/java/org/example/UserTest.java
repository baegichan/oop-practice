package org.example;

import org.example.passwd.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    @DisplayName("패스워드 초기화 여부 판단")
    @Test
    void passwdTest() {
        //given
        User user = new User();
        //when
        user.initPasswd(new CorrectFixedPasswordGenerator());
        //user.initPasswd(() -> "12345678");
        //then
        assertThat(user.getPasswd()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지않아 초기화가 되지 않는다")
    @Test
    void passwdTest2() {
        //given
        User user = new User();
        //when
        user.initPasswd(new WrongFixedPasswordGenerator());
        //user.initPasswd(() -> "123");
        //then
        assertThat(user.getPasswd()).isNull();
    }
}