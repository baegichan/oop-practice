package org.example;

import org.example.passwd.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {
    public String generatePassword(){
        //2글자생성용 제너레이터
        return "12";
    }
}
