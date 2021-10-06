package seleniumnew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtables {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/table.html");
	//driver.findElement(By.id("table-id")).click();
	//System.out.println("before table");
	//driver.findElement(By.linkText("Table")).click();
	//System.out.println("after table");
	//WebElement table = driver.findElement(By.id("table-id"));
	List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='table_id']//tr/th"));
	System.out.println("No of columns in table:" +Columns.size());
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
	System.out.println("No of rows in table:"+rows.size());
    String findElement1 = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td")).getText();
	System.out.println(findElement1);
    List<Integer> vitalTaskList=new ArrayList<Integer>();
    List<WebElement> progvalueList = driver.findElements(By.xpath("//table[@id='table_id']//tr/td[2]"));
    for(int i=0;i<progvalueList.size();i++)
    {
    	String text=progvalueList.get(i).getText();
    	System.out.println(text);
    	String replaceAll=text.replaceAll("%","");
    	System.out.println(replaceAll);
    	int parseInt = Integer.parseInt(replaceAll);
    	System.out.println(parseInt);
    	vitalTaskList.add(parseInt);
    	
    }
    Integer min = Collections.min(vitalTaskList);
    System.out.println("Minimum value:"+min);
    driver.findElement(By.xpath("//td[contains(text(),'"+min+"')]"));
	}}

