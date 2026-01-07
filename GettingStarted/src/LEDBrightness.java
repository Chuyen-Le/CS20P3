//Add Phidgets Library 
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
        int brigthness = 1;
        
        while (brigthness < 10)
        {
        	redLED.setDutyCycle((double) brigthness / 10);
        	Thread.sleep(1000);
        	brigthness++;
        }
        
        while (brigthness >= 0)
        {
        	redLED.setDutyCycle((double) brigthness / 10);
        	Thread.sleep(1000);
        	brigthness--;
        }
    }
}
