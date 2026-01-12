//Add Phidgets Library
package AdvancedLessons;

import com.phidget22.*;

public class ButtonLED 
{   
    //Handle Exceptions
    public static void main(String[] args) throws Exception 
    {
        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
        int countRed = 0;
        int countGreen = 0;
        
        // Initial boolean of the state of red and green buttons
        boolean LastRedState = false;
        boolean LastGreenState = false;

        while (true)
        {
        	boolean CurrentRedState = redButton.getState();
            boolean CurrentGreenState = greenButton.getState();

            // Detect red button press (false -> true)
            if (CurrentRedState && !LastRedState)
            {
                countRed++;
                System.out.println("Red: " + countRed + " -- Green: " + countGreen);
            }
            redLED.setState(CurrentRedState);
            LastRedState = CurrentRedState;
            
            // Detect green button press (false -> true)
            if (CurrentGreenState && !LastGreenState)
            {
                countGreen++;
                System.out.println("Red: " + countRed + " -- Green: " + countGreen);
            }
            greenLED.setState(CurrentGreenState);
            LastGreenState = CurrentGreenState;
          
            // Check for winner
            if (countRed == 10 || countGreen == 10)
            {
            	
            	// Determine winner
            	DigitalOutput winnerLED = (countRed == 10) ? redLED : greenLED;
            	
            	if (winnerLED == redLED)
                {
                	System.out.print("Red wins");
                }
                else
                {
                	System.out.print("Green wins");
                }
               
            	// Flash BOTH LEDs once
                redLED.setState(true);
                greenLED.setState(true);
                Thread.sleep(1000);
                redLED.setState(false);
                greenLED.setState(false);
                Thread.sleep(1000);

                // Flash winner LED 5 times
                for (int i = 0; i < 5; i++)
                {
                    winnerLED.setState(true);
                    Thread.sleep(500);
                    winnerLED.setState(false);
                    Thread.sleep(500);
                }
                
                // Stop winner LED
                winnerLED.setState(false);

                // End game
                break;
            }
        }
        
        // Close both red and green LED
        redLED.close();
        greenLED.close();
    }
}
  