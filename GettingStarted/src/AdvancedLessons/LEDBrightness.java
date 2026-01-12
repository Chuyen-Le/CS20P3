//Add Phidgets Library 
package AdvancedLessons;

import com.phidget22.*;	

public class LEDBrightness 
{
    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {
        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets with Duty Cycle
        for (int i = 1; i <= 10; i++)
        {
        	double brigthness = i * 0.1;
        	redLED.setDutyCycle(brigthness);
        	Thread.sleep(1000);
        }
        	
        for (int i = 10; i >= 0; i--)
        {
        	double brigthness = i * 0.1;
        	redLED.setDutyCycle(brigthness);
        	Thread.sleep(1000);
        }
        
        // Close red LED
        redLED.close();
    }
}
