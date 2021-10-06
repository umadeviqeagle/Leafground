package seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		Thread.sleep(2000);
		driver.get("http://www.leafground.com/pages/Link.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@link='blue'])[2]")).click();
		Thread.sleep(2000);
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		Thread.sleep(2000);
		driver.get("http://www.leafground.com/pages/Link.html");
		//driver.findElement(By.xpath("//a[text()='Go to Home Page'])[2]")).click();
		driver.close();
		}

}
