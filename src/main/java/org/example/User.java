package org.example;

public class User {
    public String passwd;
    public void initPasswd(){
        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String randomPasswd = randomPasswordGenerator.generatePassword();
        /*
            비밀번호는 8자이상 12자 이하여야한다

         */
        if(randomPasswd.length()>= 8 && randomPasswd.length() <=12) {
            this.passwd=randomPasswd;
        }

    }

    public String getPasswd() {
        return passwd;
    }
}
