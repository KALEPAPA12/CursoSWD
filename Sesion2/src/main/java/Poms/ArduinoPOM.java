package Poms;

import org.openqa.selenium.WebDriver;

public class ArduinoPOM {
    private WebDriver driver;
    
    public ArduinoPOM(WebDriver driver) {
       // this.driver = driver;
    }
    
    public void openArduino() {
        driver.get("https://www.arduino.cc");
    }
}
