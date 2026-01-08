//Add Phidgets Library
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
        
        boolean lastRedState = false;
        boolean lastGreenState = false;

        while (true)
        {
            boolean currentRedState = redButton.getState();
            boolean currentGreenState = greenButton.getState();

            // Detect red button press (false -> true)
            if (currentRedState && !lastRedState)
            {
                countRed++;
                System.out.println("Red: " + countRed + " -- Green: " + countGreen);
            }
            redLED.setState(currentRedState);
            lastRedState = currentRedState;
            
            // Detect green button press (false -> true)
            if (currentGreenState && !lastGreenState)
            {
                countGreen++;
                System.out.println("Red: " + countRed + " -- Green: " + countGreen);
            }
            greenLED.setState(currentGreenState);
            lastGreenState = currentGreenState;
          
            // Check for winner
            if (countRed == 10 || countGreen == 10)
            {
            	if (countRed == 10)
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
                DigitalOutput winnerLED = (countRed == 10) ? redLED : greenLED;

                for (int i = 0; i < 5; i++)
                {
                    winnerLED.setState(true);
                    Thread.sleep(500);
                    winnerLED.setState(false);
                    Thread.sleep(500);
                }
                
                winnerLED.setState(false);

                // End game
                break;
            }
              
        }
        redLED.close();
        greenLED.close();
    }
}
  