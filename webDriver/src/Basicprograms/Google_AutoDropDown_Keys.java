package Basicprograms;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_AutoDropDown_Keys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.Driver", "C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//URL
		driver.get("https://google.com");
		System.out.println("Home page title: "+driver.getTitle());
		System.out.println("Home page URL: "+driver.getCurrentUrl());
		Thread.sleep(2000);
		
		//SearchBox
		driver.findElement(By.id("APjFqb")).sendKeys("what is automationn testing");
		Thread.sleep(2000);
		
		
		//SearchButton
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).sendKeys(Keys.ENTER);
		System.out.println("\nResult Page Tiltle: "+driver.getTitle());
		System.out.println("Result Page URL: "+driver.getCurrentUrl());
		Thread.sleep(2000);
	
		//Close Browser
		driver.close();
		
	}
}



