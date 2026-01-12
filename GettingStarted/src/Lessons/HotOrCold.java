//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
package Lessons;

import com.phidget22.*;

public class HotOrCold 
{
    public static void main(String[] args) throws Exception
    {
        //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
        temperatureSensor.open(1000);
        
        redLED.open(1000);
        greenLED.open(1000);

        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
        while (true)
        {
        	double celDegree = temperatureSensor.getTemperature();
        	if (20 <= celDegree && celDegree <= 24)
        	{
                greenLED.setState(true);
                Thread.sleep(1000);
                System.out.println("green - " + celDegree + " °C");
        	}
        	else
        	{
        		redLED.setState(true);
                Thread.sleep(1000);
                System.out.println("red - " + celDegree + " °C");
        	}
            Thread.sleep(150);
        }
    }
}
  
  