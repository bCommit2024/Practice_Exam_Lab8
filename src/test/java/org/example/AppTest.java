package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    MyStack<Integer> ms = new MyStack<>();


    public void setupMyStack(){
        ms.add(new Integer(99));
    }

    public void resetMyStack(){
        ms.clear();
    }

    public void testPush(){
        ms.push(new Integer(93));
        assertTrue(ms.contains(new Integer(93)));
        resetMyStack();
    }

    public void testPop(){
        setupMyStack();
        assertTrue(ms.contains(new Integer(99)));
        Integer numPop = ms.pop();
        assertEquals(numPop,new Integer(99));
        resetMyStack();
    }
}
