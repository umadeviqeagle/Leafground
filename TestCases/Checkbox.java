package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://www.leafground.com/pages/checkbox.html");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//div[@class='example']//input")).click();
	       driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']")).click();
	       boolean dr=driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isEnabled();
	       System.out.println(dr);
	       driver.findElement(By.cssSelector("div#contentblock>section>div:nth-of-type(3)>div:nth-of-type(2)>input")).click();
	       driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
	       
	       
	}

}
