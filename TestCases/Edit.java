package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver=new ChromeDriver();
       driver.get("http://www.leafground.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.findElement(By.className("wp-categories-title")).click();
       driver.findElement(By.id("email")).sendKeys("umadevi@qeagle.com");
       WebElement findElement = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
       String previousText = findElement.getAttribute("value");
       findElement.clear();
      findElement.sendKeys("xyz" + previousText, Keys.TAB);
      WebElement find = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
      String attribute = find.getAttribute("value");
      System.out.println(attribute);
      driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
      boolean ele = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
      System.out.println(ele);
    
		
	}

}
