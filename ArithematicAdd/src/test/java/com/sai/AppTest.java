package com.sai;


import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest  extends TestCase
{
    public void testWithPositives() {
    	ArithematicAdd ar = new ArithematicAdd();
    	int actual=ar.add(20, 30);
    	int expected=50;
    	assertEquals(actual,expected);
    }
    public void testWithNegatives() {
    	ArithematicAdd ar = new ArithematicAdd();
    	int actual=ar.add(-20, -30);
    	int expected=-50;
    	assertEquals(actual,expected);
    }
    public void testWithAll() {
    	ArithematicAdd ar = new ArithematicAdd();
    	int actual=ar.add(20, -30);
    	int expected=-10;
    	assertEquals(actual,expected);
    }
    public void testWithZero() {
    	ArithematicAdd ar = new ArithematicAdd();
    	int actual=ar.add(0, 0);
    	int expected=0;
    	assertEquals(actual,expected);
    }
}
