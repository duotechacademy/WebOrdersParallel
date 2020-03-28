package io.duotech.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.duotech.utils.ConfigReader;
import io.duotech.utils.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class TestBase {
	
protected WebDriver driver;
protected Actions actions;
	
	@BeforeMethod
	public void setUp () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(
				ConfigReader.getConfiguration("implicitTimeout")), TimeUnit.SECONDS);
		driver.navigate().to(ConfigReader.getConfiguration("url"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
