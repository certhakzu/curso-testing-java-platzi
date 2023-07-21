package com.platzi.javatests.util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test // indica que es un método de testeo para el repeat
    public void repeat_string_once_time() {
        Assert.assertEquals("Hola", StringUtil.repeat("Hola", 1));
    }

    @Test // indica que es un método de testeo para el repeat
    public void repeat_string_multiple_times() {
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
    }

    @Test // indica que es un método de testeo para el repeat
    public void repeat_string_zero_time() {
        Assert.assertEquals("", StringUtil.repeat("Hola", 0));
    }

    @Test(expected = IllegalArgumentException.class) // indica que espera una excepción del tipo indicado
    public void repeat_string_negative_times() {
        StringUtil.repeat("Hola", -1);
    }
}