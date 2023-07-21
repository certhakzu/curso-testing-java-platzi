package com.platzi.javatests.util;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPassword(String password){
        if (password.length() < 8 || password.matches("^[a-zA-Z]+$")){
            return SecurityLevel.WEAK;
        }
        if (password.matches("^[a-zA-Z0-9]+$")){
            return SecurityLevel.MEDIUM;
        }
        //if (password.length() >= 8 && password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*()\\-_=+{};:,<.>]).{8,}$\n")){
        return SecurityLevel.STRONG;
    }
}
