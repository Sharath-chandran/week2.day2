package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_DeleteLead {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("8939266125");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);

		WebElement lead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String leadId = lead.getText();
		System.out.println("The leadId is " + leadId);
		lead.click();

		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		// driver.findElement(By.xpath("//span[contains(text(),'Name and
		// ID')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'id')]")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(1500);

		if (driver.findElement(By.xpath("//div[@class='x-paging-info']")).isDisplayed()) {
			System.out.println("No records to display");
		} else {
			System.out.println("Records displayed");
		}

		// driver.close();

	}

}
