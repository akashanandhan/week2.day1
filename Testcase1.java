package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.name("firstNameField")).sendKeys("Akash");
		driver.findElement(By.id("lastNameField")).sendKeys("Anandhan");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Title is: \t"+driver.getTitle());
		
		driver.close();


	}

}

