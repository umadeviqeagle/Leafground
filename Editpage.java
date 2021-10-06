package seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.xpath("//h5[@class='wp-categories-title']")).click();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='TestLeaf']")).getText();
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		if(enabled==true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		driver.close();
	}

}
