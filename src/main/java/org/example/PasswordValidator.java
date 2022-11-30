package org.example;

public class PasswordValidator {

    public static final String LENGTH_EXCEPTION_MESSAGE = "비밀번호는 최소 8자이상 12자 이하여야한다.";

    public static void validate(String password) {

        int length = password.length();
        if(length<8 || length >12 ) {
            throw new IllegalArgumentException(LENGTH_EXCEPTION_MESSAGE);

        }

    }
}
