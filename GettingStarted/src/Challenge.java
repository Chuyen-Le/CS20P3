/*
A Thermostat is used to regulate temperature in a building/room. It turns the heat on when it senses the room is too cold and turns the heat off when it senses the room has reached the desired temperature.

In this project, your challenge is to create a simulated thermostat using your Humidity Phidget, push buttons and LEDs.

When using a thermostat, there is a set temperature. This is the temperature that the user sets. In your program, this should start at 21˚C or 70˚F.
Every time the user presses the green button, increase the set temperature by 1˚.
Every time the user presses the red button, decrease the set temperature by 1˚.
Print the current temperature and set temperature to the screen every 10 seconds.
If the current temperature is within 2˚ of the set temperature, turn on the green LED.
If the current temperature is not within 2˚ of the set temperature, turn on the red LED.
 */

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class temp
{
	private final double curTemp, setTemp;
	
	public temp(double curTemp, double setTemp) 
	{
        this.curTemp = curTemp;
        this.setTemp = setTemp;
    }
	
	public void getTemp() 
	{
		
		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
		
		Runnable task = new Runnable() 
		{
	        @Override
	        public void run() 
	        {
	            System.out.println("Current temperature: " + curTemp + " - Set temperature: " + setTemp);
	            
	        }
		};
		
		scheduler.scheduleAtFixedRate(task, 0, 10, TimeUnit.SECONDS);
	}
	
}
public class Challenge 
{
    public static void main(String[] args) throws Exception
    {

        //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

      //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
        temperatureSensor.open(1000);
        
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
        double setTemp = 21;
        double curTemp = 21;
 
        while(true)
        {
        	if(greenButton.getState())
        	{
                curTemp -= 1;
        	}
        	
        	if(redButton.getState())
        	{
        		curTemp -= 1;
        	}
        	
        	temp Temp = new temp(curTemp, setTemp);
        	System.out.print(Temp);
        	if (Math.abs(curTemp - setTemp) <= 2)
            {
            	redLED.setState(true);
            }
            else
            {
            	greenLED.setState(true);
            }
        }
    }
}
  
  
