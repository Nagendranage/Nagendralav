package Basicprograms;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	//Note:
		//Locator: Its HTLM attribute. Using locators we can find web-elements uniquely on web-page.
		//name()
		//cssSelector
		//className()
		//linkText()
		//partialLintText()
	public class Login_OrangeHRM 
	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			//Wait
			Thread.sleep(2000);

			//Maximize window
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			//URL
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			
			//Username
			driver.findElement(By.name("username")).sendKeys("Admin");
			Thread.sleep(2000);
			
			//Password
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(2000);
			
			//Login Button
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			Thread.sleep(2000);
			
			//Welcome Admin Button
			driver.findElement(By.className("oxd-userdropdown-tab")).click();
			Thread.sleep(2000);
			
			//Logout
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			//Close Browser
			driver.close();
			Thread.sleep(2000);
		}
	}


	
	
	

