package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractwithLocators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mahendran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Parasuraman");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XXXX");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");

		driver.findElement(By.className("smallSubmit")).click();
	    //driver.close();
		

	}

}
