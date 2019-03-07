package com.dje.test;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	@Test
	public void main() {
		System.setProperty("webdriver.chrome.driver"
				, "C:\\Users\\zhangj\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.baidu.com/");
		List<WebElement> links=driver.findElements(By.cssSelector("#u1 a"));
		assertEquals(9, links.size());
		for (int i=0;i<=links.size();i++) {
			System.out.println(links.get(i).getAttribute("href"));
		}
		driver.close();
	}	
}
