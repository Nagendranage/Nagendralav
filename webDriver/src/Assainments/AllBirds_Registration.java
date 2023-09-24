package Assainments;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllBirds_Registration 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.allbirds.com/");
		
		driver.findElement(By.cssSelector("div[class='jsx-2022988330 Icon Icon--USER jsx-2160486116 jsx-85518033']")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Nagendra");
		Thread.sleep(2000);
		
		driver.findElement(By.id("LastName")).sendKeys("Tadi");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("tadinagendra368@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("CreatePassword")).sendKeys("Nag@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("CustomerPasswordConfirmation")).sendKeys("Nag@123");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}



