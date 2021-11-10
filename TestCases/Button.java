package salesforce;

import java.awt.Color;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://www.leafground.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.findElement(By.xpath("//h5[text()='Button']")).click();
	       driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
	       driver.findElement(By.xpath("//h5[text()='Button']")).click();
	       WebElement find = driver.findElement(By.xpath("//button[text()='Get Position']"));
		   Point location = find.getLocation();
		   System.out.println(location);
		   WebElement t = driver.findElement(By.xpath("//button[@id='color']"));
		   String s = t.getCssValue("color");
		   System.out.println("Color is :" + s);
		   Dimension size = driver.findElement(By.xpath("//button[@id='size']")).getSize();
		   System.out.println("size is"+ size);
		  
	      
	      
	}

}
