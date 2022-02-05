package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom_XpathBasics {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[@id='ext-gen856']")).click();
		driver.findElement(By.xpath("//a[@id='ext-gen603']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sharath chandran");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("D");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Indium Software"); // (//input[contains(@name,'Name')])[9]
		driver.findElement(By.xpath("//input[contains(@name,'Button')]")).click();

	}
}
