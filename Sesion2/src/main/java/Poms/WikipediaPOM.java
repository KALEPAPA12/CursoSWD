package Poms;

import org.openqa.selenium.WebDriver;

public class WikipediaPOM {
    private WebDriver driver;
    
    public WikipediaPOM(WebDriver driver) {
        this.driver = driver;
    }
    
    public void openWikipedia() {
        driver.get("https://www.wikipedia.org");
    }
}
