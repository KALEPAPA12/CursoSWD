package Poms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class MainScript {
    private WebDriver driver;

    @Before
    public void setup() {
        // Establecer la ubicación del archivo chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "ruta_del_chromedriver.exe");
        
        // Crear una instancia del navegador Chrome
        driver = new ChromeDriver();
    }

    @Test
    public void automationPractice() {
        // Abrir la página "Automation Practice"
        driver.get("http://automationpractice.com");

        // Ejemplo de interacción: buscar un elemento y realizar una acción
        WebElement searchInput = driver.findElement(By.id("search_query_top"));
        searchInput.sendKeys("camiseta");
        searchInput.submit();

        // Ejemplo de aserción: verificar que se muestra un resultado de búsqueda
        WebElement searchResult = driver.findElement(By.className("product-count"));
        System.out.println("Número de resultados de búsqueda: " + searchResult.getText());
    }

    @After
    public void teardown() {
        // Cerrar el navegador
        driver.quit();
    }
}
