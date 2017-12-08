/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.ch02.client;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author barcvilla
 */
public class HelloWorldTest 
{
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    
    @Before
    public void setUp()
    {
        System.setOut(new PrintStream(outStream));
    }
    
    @Test
    public void testSayHello()
    {
        HelloWorld hw = new HelloWorld();
        hw.sayHello();
        Assert.assertEquals("Hello world", outStream.toString());
    }
    
    @After
    public void cleanUp()
    {
        System.setOut(null);
    }
}
