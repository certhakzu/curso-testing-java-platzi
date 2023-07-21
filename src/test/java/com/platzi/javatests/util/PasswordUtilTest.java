package com.platzi.javatests.util;

import org.junit.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void assessPassword_weak() { // menos de 8 caracteres
        assertEquals(WEAK, PasswordUtil.assessPassword("123456"));
    }

    @Test
    public void assessPassword_medium() { // con letras
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcdegh123"));
    }

    @Test
    public void assessPassword_strong() { // con letras y numeros
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }

}