package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.j2objc.annotations.Property;

public class Base {
	public WebDriver driver; // globally define driver
	public Properties prop; // globally define properties

	public void driverInitilize() throws IOException {
		// read the file
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		prop = new Properties();
		prop.load(fs); // load the read file or access
		String browsername = prop.getProperty("browser");
		// for different browsers
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("browser is not matching");
		}
	}

	@BeforeMethod
	public void openurl() throws IOException {
		driverInitilize();
		String urlname = prop.getProperty("url");
		driver.get(urlname);
	}/*

	@AfterMethod
	public void closebrowser() {
		driver.close();
	}*/

}
