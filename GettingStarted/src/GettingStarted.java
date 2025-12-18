
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class GettingStarted 
{
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception
    {

        //Create | Create objects for your buttons and LEDs.
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

        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

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
            
            // Detect green button press (false -> true)
            if (currentGreenState && !lastGreenState)
            {
                countGreen++;
                System.out.println("Red: " + countRed + " -- Green: " + countGreen);
            }

            // Update previous states
            lastRedState = currentRedState;
            lastGreenState = currentGreenState;

          
            // Check for winner
            if (countRed == 10 || countGreen == 10)
            {
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

                break; // End game
            }
        }
    }
}
  