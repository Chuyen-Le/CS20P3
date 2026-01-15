package AdvancedLessons;

// Add Phidgets Library
import com.phidget22.*;

public class AttachDetach 
{
    public static void main(String[] args) throws Exception 
    {
    	// Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput button = new DigitalInput();
        DigitalOutput led = new DigitalOutput();

        // Address 
        button.setHubPort(0);
        button.setIsHubPortDevice(true);

        led.setHubPort(1);
        led.setIsHubPortDevice(true);

        // Attach / Detach events
        
        // Test Temperature Sensor
        temperatureSensor.addAttachListener(new AttachListener() 
        {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach: Temperature Sensor");
            }
        });

        temperatureSensor.addDetachListener(new DetachListener() 
        {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach: Temperature Sensor");
            }
        });

        // Test LED
        led.addAttachListener(new AttachListener() 
        {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach: LED");
            }
        });

        led.addDetachListener(new DetachListener() 
        {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach: LED");
            }
        });

        // Test Button
        button.addAttachListener(new AttachListener() 
        {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach: Button");
            }
        });

        button.addDetachListener(new DetachListener() 
        {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach: Button");
            }
        });

        // Sensor event
        temperatureSensor.addTemperatureChangeListener(
            new TemperatureSensorTemperatureChangeListener() 
            {
                public void onTemperatureChange(
                        TemperatureSensorTemperatureChangeEvent e) 
                {
                    System.out.println("Temperature: " + e.getTemperature() + "°C");
                }
            }
        );

        // Open
        temperatureSensor.open(1000);
        button.open(1000);
        led.open(1000);

        // Keep program running
        while (true) 
        {
            Thread.sleep(150);
        }
    }
}
