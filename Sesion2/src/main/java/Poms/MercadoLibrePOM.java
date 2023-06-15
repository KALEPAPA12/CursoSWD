package Poms;

import org.openqa.selenium.WebDriver;

public class MercadoLibrePOM {
    private WebDriver driver;
    
    public MercadoLibrePOM(WebDriver driver) {
        this.driver = driver;
    }
    
    public void openMercadoLibre() {
        driver.get("https://www.mercadolibre.com");
    }
}
