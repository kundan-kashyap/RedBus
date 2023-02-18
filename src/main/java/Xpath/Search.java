package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
	
	public WebDriver driver;
	private By from=By.xpath("//input[@id='src']");
	private By dropin=By.xpath("//li[@class='selected']");
	private By to=By.xpath("//input[@id='dest']");
	private By dropout=By.xpath("//li[@class='selected']");
	private By next=By.xpath("//td[@class='next']");
	private By month=By.xpath("//td[@class='monthTitle']");
	private By date=By.xpath("//td[@class='wd day']");
	private By search=By.xpath("//button[@id='search_btn']");
	private By buses=By.xpath("//span[@class='bus_timing']");
	
	public Search(WebDriver driver2) {
		this.driver=driver2;
		}
		public WebElement enterfrom() {
		return driver.findElement(from)
;		}
		public WebElement typedropin() {
			return driver.findElement(dropin);
	}
		public WebElement enterto() {
			return driver.findElement(to);}
		public WebElement typedropout() {
			return driver.findElement(dropout)
;		}
		public WebElement clicknext() {
			return driver.findElement(next);
		}		
		public WebElement selectmonth() {
			return driver.findElement(month)	

;}
		public List<WebElement> selectdate(){
			return driver.findElements(date);
		}
		public WebElement clicksearch() {
			return driver.findElement(search)
;			
		}
		public List<WebElement> selectbuses(){
			return driver.findElements(buses);
		}
		}
	
	


