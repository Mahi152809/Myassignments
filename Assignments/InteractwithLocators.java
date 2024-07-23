package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractwithLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Mahendran Parasuraman");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("100");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.name("industryEnumId")).sendKeys("Aerospace");
		driver.findElement(By.className("smallSubmit")).click();
	    //driver.close();
		

	}

}
