package com.softwareengineering.course;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.lang.Math;

import com.softwareengineering.course.Hybrid;

public class HybridTests 
	    extends TestCase
{
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HybridTests( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HybridTests.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testHybrid()
    {
		Hybrid hybrid=new Hybrid();
		
				double miles = 30.0;
				double gallons = 1.0;
				double expectedMPG = miles/gallons;
				hybrid.setGallonsfromGas(gallons);
				hybrid.setMilesfromGas(miles);
		
				double actualMPG = hybrid.calcGasMPG();
		
				assertTrue(actualMPG == expectedMPG);
		
		
				 miles = 100.0;
				double kWh = 33.7;
				double expectedMPGe = 100.0;
		
				hybrid.setElectricMiles(miles);
				hybrid.setTotalkWh(kWh);
		
				double actualMPGe = hybrid.calcMPGe();
		
				assertTrue(actualMPGe == expectedMPGe);
			
		
				 miles = 100.0;
				 kWh = 44.9;
				 expectedMPGe = 100.0;
				
				hybrid.setElectricMiles(miles);
				hybrid.setTotalkWh(kWh);
		
				 actualMPGe = hybrid.calcMPGe();
		
				assertFalse(actualMPGe == expectedMPGe);
		
		
	}
	
}