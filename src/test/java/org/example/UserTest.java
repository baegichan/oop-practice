package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @DisplayName("패스워드 초기화 여부 판단")
    @Test
    void passwdTest() {
        //given
        User user = new User();
        //when
        user.initPasswd(new CorrectFixedPasswordGenerator());
        //then
        assertThat(user.getPasswd()).isNotNull();
    }
}