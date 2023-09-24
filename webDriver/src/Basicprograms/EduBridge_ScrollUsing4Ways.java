package Basicprograms;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class EduBridge_ScrollUsing4Ways 
	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.Driver", "C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			//URL
			driver.get("https://www.edubridgeindia.com/");
			Thread.sleep(2000);
			
			//Scroll
			//Step1:Create object for javaScriptExecuter
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			//Way1:Scrolling Using Pixel
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			
			//Way2:Scroll till webElement
			WebElement course=driver.findElement(By.xpath("/html/body/div[1]/main/div/section[3]/div[2]/div[2]/div/button"));
			js.executeScript("arguments[0].scrollIntoView()", course);
			Thread.sleep(2000);
			
			//WAY3:Scroll to Bottom
			js.executeScript("window.scroll(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			
			//WAY3:Scroll to UP
			js.executeScript("window.scroll(0,-document.body.scrollHeight)");
			Thread.sleep(2000);	
			
			//Close
			driver.close();
		}
	}


