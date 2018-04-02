package com.docAnalyzer;



import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RunnerTest 
{
	 // fields used together with @Parameter must be public
    @Parameter(0)
    public int m1;
    @Parameter(1)
    public int m2;
    @Parameter(2)
    public int result;
    
 // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 1 , 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
        return Arrays.asList(data);
    }


    @Test
    public void testMultiplyException() {
        MyClass tester = new MyClass();
        assertEquals("Result", result, tester.multiply(m1, m2));
    }
	/**
	 * 
	 * @param args
	 
	
	public static void main(String[] args) 
	{
	    Result result = JUnitCore.runClasses(Object.class);
	    for (Failure failure : result.getFailures()) 
	    {
	      System.out.println(failure.toString());
	    }
	    
	}
	*/
	// class to be tested
    class MyClass {
        public int multiply(int i, int j) {
            return i *j;
        }
    }
}
