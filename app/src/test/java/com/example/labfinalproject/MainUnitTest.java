package com.example.labfinalproject;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainUnitTest {
    Functionalities ob1 = new Functionalities();
    @Test
    public void additionTest() throws Exception
    {
        assertEquals("4.0",ob1.add(2.0,2.0).toString());
        assertEquals("9.8",ob1.add(2.3,7.5).toString());

    }
    @Test
    public void subTest() throws Exception
    {
        assertEquals("4.0",ob1.subtract(6.0,2.0).toString());
        assertEquals("10.0",ob1.subtract(12.3,2.3).toString());

    }

    @Test

    public void mulTest() throws Exception
    {
        assertEquals("4.0",ob1.multiply(2.0,2.0).toString());
        assertEquals("10.0",ob1.multiply(5.0,2.0).toString());

    }
    @Test

    public void divTest() throws Exception
    {
        assertEquals("4.0",ob1.divide(8.0,2.0).toString());
        assertEquals("10.0",ob1.divide(20.0,2.0).toString());

    }



}
