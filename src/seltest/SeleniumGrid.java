package seltest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	@Test
	public void Homepagecheck() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.213:4444"),caps);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Saiteja379");
		driver.close();
	}
}
