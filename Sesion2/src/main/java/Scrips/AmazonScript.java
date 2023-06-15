package Scrips;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonScript {
    private WebDriver driver;
    private Poms.AmazonPOM AmazonPOM;

    @Before
    public void setup() {
    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

        
        driver = new ChromeDriver(options);
        AmazonPOM = new Poms.AmazonPOM(driver);
    }

    @Test
    public void testAmazonProductSearch() {

        AmazonPOM.navigateToAmazon();

     
        AmazonPOM.searchProduct("celulares");

       
  
        String productName = AmazonPOM.getProductName();
        System.out.println("El nombre del producto es: " + productName);

        AmazonPOM.searchProduct("celulares baratos");

        AmazonPOM.clickOnProductLink(0);

        String cheapestProductName = AmazonPOM.getProductName();
        System.out.println("El celular más barato es: " + cheapestProductName);
    }

    @After
    public void cleanup() {
        driver.quit();
    }
}
