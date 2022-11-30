package org.example;

public class User {
    public String passwd;
    public void initPasswd(PasswordGenerator passwordGenerator){
 //리팩토링전
 //     RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGenerator.generatePassword();
        /*
            비밀번호는 8자이상 12자 이하여야한다

         */
        if(password.length()>= 8 && password.length() <=12) {
            this.passwd=password;
        }

    }

    public String getPasswd() {
        return passwd;
    }
}
