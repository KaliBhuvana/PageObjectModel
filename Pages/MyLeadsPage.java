package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	public CreateLeadPage clickCreateLeadLink() {
		System.out.println(driver);
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}

}
