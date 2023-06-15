package Poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
	
	WebDriver driver;
	String searchBarId = "APjFqb";
	String firstResult = "//h3[text()='Wikipedia']";
	String resultsClass = "//h3[@class='LC20lb MBeuO DKV0Md']";
	

	public GooglePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public GooglePage() {
		// TODO Auto-generated constructor stub
	}

	public void typeOnSearchBar(String value) {
		
		WebElement searchBar = driver.findElement(By.id(searchBarId));
		searchBar.sendKeys(value);
		searchBar.sendKeys(Keys.ENTER);
		
	}
	
	public void clickFirstResult() {
		
		WebElement fr = driver.findElement(By.xpath(firstResult));
		fr.click();
	}
	
	public void printFirstResult() {
		
		WebElement fr = driver.findElement(By.xpath(firstResult));
		System.out.println(fr.getText());
	}
	
	public void clickResultById(int result) {
		
		List <WebElement> list = driver.findElements(By.xpath(resultsClass));
		list.get(result).click();
		
	}
	
	public void printTitle() {
		
		System.out.println(driver.getTitle());
	}
	
	public void printResults() {
		List <WebElement> list = driver.findElements(By.xpath(resultsClass));
		
		for(WebElement element: list) {
			System.out.println(element.getText());
		}
	}
	
}