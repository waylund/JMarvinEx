package com.agile42.MarvinEXJ.tests;

import static org.junit.Assert.*;
import com.agile42.MarvinEXJ.Marvin;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by danielmlynn on 9/20/16.
 */
public class MarvinTest {

    @Test
    public void statementTest() {
        Marvin marvin = new Marvin();
        String response = marvin.talk("Hi There.");
        Assert.assertEquals("Whatever.", response);
    }

    @Test
    public void questionTest() {
        Marvin marvin = new Marvin();
        String response = marvin.talk("Are you hungry?");
        Assert.assertEquals("I don't care.", response);
    }

}