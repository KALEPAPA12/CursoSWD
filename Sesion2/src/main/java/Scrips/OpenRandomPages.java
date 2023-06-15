package Scrips;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenRandomPages {
    public static void main(String[] args) {
        // Establecer la ubicación del archivo chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

        // Crear una instancia del navegador Chrome
        WebDriver driver = new ChromeDriver();

        // Definir una lista de URLs aleatorias
        String[] urls = {
            "https://www.google.com",
            "https://www.amazon.com",
            "https://www.microsoft.com",
            "https://www.wikipedia.org",
            "https://www.youtube.com"
        };

        // Abrir las páginas web aleatorias
        for (int i = 0; i < 5; i++) {
            int randomIndex = (int) (Math.random() * urls.length);
            driver.get(urls[randomIndex]);
        }

        // Cerrar el navegador
        driver.quit();
    }
}
