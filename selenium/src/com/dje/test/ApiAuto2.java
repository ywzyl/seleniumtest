package com.dje.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *  GET请求   不携带请求头
 * @author zhangj
 *
 */
public class ApiAuto2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"
							, "C:\\Users\\zhangj\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		List<InterfaceEntity> interfacelist=new ArrayList<InterfaceEntity>();
		
		Map<String, Object> params=new HashMap<String, Object>();
		
		params.put("bussAppName", "OA");
		
		InterfaceEntity getEmpList=new InterfaceEntity(GlobalVariable.HOST+"/yunxiazi-rest/dje/getEmpList", params);
		
		interfacelist.add(getEmpList);
		
		for(InterfaceEntity interfaceEntity : interfacelist){			
			String requestUrl =interfaceEntity.getHttpGetUrl();		            
			System.out.println("接口地址:"+requestUrl);            
			driver.get(interfaceEntity.getHttpGetUrl());            
			WebElement webElement = driver.findElement(By.xpath("/html/body/pre"));
            interfaceEntity.setResult(webElement.getText());
            System.out.println("result:"+webElement.getText());
        }
       driver.close();
	}
}
