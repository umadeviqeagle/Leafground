package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://www.leafground.com/pages/radio.html");
	       driver.findElement(By.xpath("//input[@class='myradio']")).click();
	       driver.findElement(By.xpath("//label[text()='Find default selected radio button']/following::input")).click();
	       driver.findElement(By.xpath("//input[@name='age']")).click();
	       //driver.close();
	}

}
