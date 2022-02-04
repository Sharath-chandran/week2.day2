package week2.day2;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sharath");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Chandran");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8939266125");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Demo@123");

		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		Select Dropdown1 = new Select(Day);
		Dropdown1.selectByValue("28");

		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Select Dropdown2 = new Select(Month);
		Dropdown2.selectByValue("11");

		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select Dropdown3 = new Select(Year);
		Dropdown3.selectByVisibleText("1994");

		driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();

	}

}
