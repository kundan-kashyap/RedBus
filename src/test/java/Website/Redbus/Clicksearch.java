package Website.Redbus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.Values;
import Resources.commonMethods;
import Xpath.Search;

public class Clicksearch extends Base {
	@Test
	public void search() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Search obj=new Search(driver);
		driver.manage().window().maximize();
		obj.enterfrom().click();
		obj.enterfrom().sendKeys(Values.from);
		obj.typedropin().click();
		obj.enterto().sendKeys(Values.to);
		obj.typedropout().click();
		obj.selectmonth().click();
		String t="";
		while(!(t.equals("Apr 2023"))) {
			obj.clicknext().click();
			t=obj.selectmonth().getText();}
			//obj.selectmonth().click();
		for(WebElement a:obj.selectdate()) {
			if(a.getText().equalsIgnoreCase("12")) {
				a.click();
				break;
			}	
		}
		obj.clicksearch().click();
		//driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		commonMethods.forloopuse(obj.selectbuses(), "07:15");
		
		}		
	}


