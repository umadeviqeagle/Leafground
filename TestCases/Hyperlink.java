package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://www.leafground.com/");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
	       driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
	       Thread.sleep(1000);
	       //driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//a)[2]")).sendKeys("Your keyword",Keys.ENTER);
	       driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).sendKeys("Your keyword",Keys.ENTER);
	       driver.findElement(By.xpath("//a[text()='How many links are available in this page?']")).click();
	       driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
	       driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
	       
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']")).click();
	       
}

}
