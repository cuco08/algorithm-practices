package com.galeanos.algorithm.palyndrome;

import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.After;

public class PalyndromeTest {
    private Palyndrome palindrome1;

    @BeforeClass
    public static void setUp(){
        System.out.println("Before class");

    }

    @Before
    public void preconditions(){
        System.out.println("Before Test Method");
        palindrome1 = new Palyndrome();
    }


    @Test
    public void testIsPalyndrome_StringNull(){
        String cadena=null;
        boolean isPalyndrome;
        isPalyndrome = palindrome1.isPalyndrome(cadena);
        Assert.assertFalse(isPalyndrome);
    }

    @Test
    public void testIsPalyndrome_InvalidString() {
        String cadena = "Test Usando @$1 ";
        boolean isPalyndrome;
        isPalyndrome = palindrome1.isPalyndrome(cadena);
        Assert.assertFalse(isPalyndrome);
    }

    @Test
    public void testIsPalyndrome_InvalidString_usingNumbers() {
        String cadena = "111 111 111";
        boolean isPalyndrome;
        isPalyndrome = palindrome1.isPalyndrome(cadena);
        Assert.assertTrue(isPalyndrome);
    }

    @Test
    public void testIsPalyndrome_InvalidString_usingSpaces() {
        String cadena = "2                      11 111                              12";
        boolean isPalyndrome;
        isPalyndrome = palindrome1.isPalyndrome(cadena);
        Assert.assertTrue(isPalyndrome);
    }

    @Test
    public void testIsPalyndrome_InvalidString_usingPunctuation() {
        String cadena = "..,..";
        boolean isPalyndrome;
        isPalyndrome = palindrome1.isPalyndrome(cadena);
        Assert.assertTrue(isPalyndrome);
    }

    @Test
    public void testIsPalyndrome_ValidString() {
        String cadena = "anita Lava la Tina";
        boolean isPalyndrome;
        isPalyndrome = palindrome1.isPalyndrome(cadena);
        Assert.assertTrue(isPalyndrome);
    }

    @After
    public void tearDown(){
        System.out.println("After test Methods");
    }
    @AfterClass
    public static void bye(){
        System.out.println("After Class");
    }
}
