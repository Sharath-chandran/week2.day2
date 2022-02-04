package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_DuplicateLead {
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
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);

		WebElement Firstname = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String FName = Firstname.getText();
		System.out.println("Resulting First name is " + FName);
		Firstname.click();

		driver.findElement(By.xpath("//a[contains(text(),'Duplicate')]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(1500);
		System.out.println("The Duplicate Lead Name is same as captured name "
				+ driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText());
		// driver.close();
	}

}
