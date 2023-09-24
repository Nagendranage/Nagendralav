package Assainments;
	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class AllBirds_Login 
	{
		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.allbirds.com/");
			
			driver.findElement(By.cssSelector("div[class='jsx-2022988330 Icon Icon--USER jsx-2160486116 jsx-85518033']")).click();
			
			driver.findElement(By.id("CustomerEmail")).sendKeys("tadinagendra368@gmail.com");
			
			driver.findElement(By.id("CustomerPassword")).sendKeys("Nag@123");
			
			driver.findElement(By.cssSelector("input[value='Sign In']")).click();
			
			driver.findElement(By.linkText("LOGOUT")).click();
			
			driver.close();
		}
	}



