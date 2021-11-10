package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://www.leafground.com/pages/drag.html");
	       WebElement element = driver.findElement(By.id("draggable"));
	       Actions builder=new Actions(driver);
	       builder.dragAndDropBy(element, 100, 100).perform();
	       
	}

}
