package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("FristName")).sendKeys("Akash");
		Thread.sleep(2000);
		driver.findElement(By.name("LastName")).sendKeys("Anandhan");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("akashstyen007@gmail.com");
		driver.findElement(By.id("password_setp_input")).sendKeys("akash007");
		WebElement day = driver.findElement(By.id("day"));
		Select dd = new Select(day);
		dd.selectByVisibleText("23");
		WebElement month = driver.findElement(By.id("month"));
		Select mm = new Select(month);
		mm.selectByVisibleText("Ocb");
		WebElement year = driver.findElement(By.id("year"));
		Select yy = new Select(year);
		yy.selectByVisibleText("1999");
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();

	}
}