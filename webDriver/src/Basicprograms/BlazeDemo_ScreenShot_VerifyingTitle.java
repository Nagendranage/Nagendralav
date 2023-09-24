package Basicprograms;

	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import com.google.common.io.Files;

	public class BlazeDemo_ScreenShot_VerifyingTitle 
	{
		public static void main(String[] args) throws IOException, InterruptedException 
		{
			System.setProperty("webdriver.chrome.Driver", "C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			//URL
			driver.get("https://blazedemo.com/");
			System.out.println("Home Page Title: "+driver.getTitle());
			System.out.println("URL of home page:"+driver.getCurrentUrl());
			Thread.sleep(2000);
			
			//destination of the week! The Beach!
			//driver.findElement(By.linkText("destination of the week! The Beach!")).click();
			//driver.findElement(By.partialLinkText("destination").click();
			driver.findElement(By.xpath("/html/body/div[2]/div/p[2]/a")).click();
			System.out.println("URL of vacation page:"+driver.getCurrentUrl());
			Thread.sleep(2000);
			
			//Take a ScreenShot
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f, new File("./Demo.jpg"));
			Thread.sleep(2000);
			
			//Verifying the Title
			System.out.println("\nVerifying Title: ");
			
			String actualTitle=driver.getTitle();
			String exceptedTitle="BlazeDemo - vacation";
			
			System.out.println("Actual Title: "+actualTitle);
			System.out.println("Excepted Title: "+exceptedTitle);
			if(actualTitle.equals(exceptedTitle))
			{
				System.out.println("TestCase Passed.");
			}
			else
			{
				System.out.println("TestCase Failed.");
			}
			driver.close();
		}
	}


