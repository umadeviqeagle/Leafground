package seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='home']")).click();
		Thread.sleep(2000);
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.findElement(By.xpath("//button[@id='position']")).click();
		Thread.sleep(2000);
		String color=driver.findElement(By.xpath("//button[@id='color']")).getCssValue("color");
		System.out.println(color);
		WebElement size=driver.findElement(By.xpath("//button[@id='size'])"));
		System.out.println(size);
		//driver.findElement(By.xpath("//a[text()='Go to Home Page']
	}

}
