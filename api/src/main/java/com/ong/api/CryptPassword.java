package com.ong.api;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CryptPassword {
    String password;
    String hashedPassword;
    public String CryptPassword(String password){
        this.password = password;
        BCryptPasswordEncoder encoderPassword = new BCryptPasswordEncoder();
        hashedPassword = encoderPassword.encode(password);
        return hashedPassword;
    }
    public Boolean DescriptedPassword(String password, String hashedPassword){
        this.password = password;
        this.hashedPassword = hashedPassword;
        BCryptPasswordEncoder decoderPassword = new BCryptPasswordEncoder();
        boolean verify = decoderPassword.matches(password, hashedPassword);

        return verify;
    }


}
