package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomAssignment_HandleDropdown {
	public static void main(String[] args) {
		// To setup the driver---Instead of System.set property
		WebDriverManager.chromedriver().setup();

		// To find the driver path
		// System.out.println(System.getProperty(webdriver.chrome.driver));
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		WebElement SourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(SourceDropDown);
		dropdown.selectByValue("LEAD_EMPLOYEE");

		WebElement IndustryDropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown1 = new Select(IndustryDropDown);
		dropdown1.selectByValue("IND_FINANCE");

		WebElement OwnershipDropDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown2 = new Select(OwnershipDropDown);
		dropdown2.selectByValue("OWN_PARTNERSHIP");

	}

}
