package org.example;

import org.example.passwd.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {
    public String generatePassword(){
        //8글자생성용 제너레이터
        return "12345678";
    }
}
