package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://www.leafground.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   //driver.findElement(By.xpath("//div[contains(@class,'large-6 small-12')]//img")).click();
	       driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[4]")).click();
		   driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		   driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[4]")).click();
		   driver.findElement(By.cssSelector("div#contentblock>section>div:nth-of-type(3)>div>div>img")).click();
		   Actions builder = new Actions(driver);
		   WebElement txtUsername = null;
		   builder.keyDown(txtUsername, Keys.SHIFT);
		   
		   
	}

	
	}


