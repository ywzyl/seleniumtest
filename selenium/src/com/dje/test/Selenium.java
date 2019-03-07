package com.dje.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"
				, "C:\\Users\\zhangj\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.baidu.com/");		
	}	
}
