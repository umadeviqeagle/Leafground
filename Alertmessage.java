package seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;

public class Alertmessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[9]")).click();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(200000000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert.accept();
		Thread.sleep(2000);
		
	}

}
