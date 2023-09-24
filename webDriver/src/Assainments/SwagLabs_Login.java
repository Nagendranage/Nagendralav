package Assainments;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SwagLabs_Login 
	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\chromedriver.exe");
			Thread.sleep(2000);
			
			WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.name("user-name")).sendKeys("standard_user");
			Thread.sleep(2000);
			
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.className("bm-burger-button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			driver.close();
			Thread.sleep(2000);
		}
	}


