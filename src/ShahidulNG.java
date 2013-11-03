import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ShahidulNG 
{
FirefoxDriver driver=new FirefoxDriver();

@BeforeTest
public void start()
{
	driver.get("http://www.facebook.com");
	
}
@AfterTest
public void end()
{
	driver.quit();
}
@Test
public void loginin()
{
	driver.findElement(By.id("email")).sendKeys("sdhggh@yahoo.com");
	}
}
