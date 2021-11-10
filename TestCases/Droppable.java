package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://www.leafground.com/pages/drop.html");
	       WebElement element = driver.findElement(By.id("draggable"));
	       WebElement element1 = driver.findElement(By.id("droppable"));
	       Actions builder=new Actions(driver);
	       builder.dragAndDrop(element, element1).perform();
	}

}
