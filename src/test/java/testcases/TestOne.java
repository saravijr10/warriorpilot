package testcases;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOne {
	
	//test cases updated
	
	@Test
	public void BasicTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		
		WebElement words =  driver.findElement(By.name("q"));
		
		words.sendKeys("Java Down");
		
		Thread.sleep(2000);
		
		//List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='option']/div[1]/span"));
		
		String text;
		
		WebElement l = driver.findElement(By.xpath("//ul[@role='listbox']//div[@role='option']/div[1]/span"));
		
		words.sendKeys(Keys.ARROW_DOWN);
		
		text = l.getText();
		
		if(l.equals("java"))
		
		
		
		
		driver.close();
	}

}
