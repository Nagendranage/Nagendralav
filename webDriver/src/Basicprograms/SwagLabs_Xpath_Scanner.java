package Basicprograms;

	
	import java.util.Scanner;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SwagLabs_Xpath_Scanner 
	{
		public static void main(String[] args) throws InterruptedException
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Username: ");
			String usn=s.next();
			System.out.println("Enter Password: ");
			String pwd=s.next();
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(usn);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='login-button']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			Thread.sleep(2000);
			
			driver.close();
			Thread.sleep(2000);
		}
	}



