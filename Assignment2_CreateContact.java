package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_CreateContact {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sharath");
		driver.findElement(By.id("lastNameField")).sendKeys("Chandran");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Hi, I am learnig selenium in Testleaf.");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sharath@gmail.com");

		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select Dropdown = new Select(State);
		Dropdown.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Hi, I am learnig selenium in Testleaf.");
		driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
		System.out.println(driver.getTitle());

	}

}
