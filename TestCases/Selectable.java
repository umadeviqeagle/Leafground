package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	private static WebElement item5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://www.leafground.com/pages/selectable.html");
	       WebElement item2=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[1]"));
	       WebElement item4=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[4]"));
	       Actions builder=new Actions(driver);
	       Actions.keyDown(Keys.CONTROL).click(item2).click(item4).build().perform();
		
	}

}
