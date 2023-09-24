package Basicprograms;


	
	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import com.google.common.io.Files;

	public class BlazeDemo_DropDown 
	{
		public static void main(String[] args) throws InterruptedException, IOException
		{
			Select s;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(2000);
			
			//URL
			driver.get("https://blazedemo.com/");
			
			//DropDown 1:Departure city <Tagname>must  be <Select>
			//Step 1:Create object of select class
			s = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
			//Step 2:Select Option
			s.selectByIndex(3);
			Thread.sleep(2000);
			
			//DropDown 2:Destination City
			//Step1:
			s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
			//Select 2: select option
			s.selectByValue("New York");
			//s.selectByVisibleText("New York");
			Thread.sleep(2000);
			
			//Find Flight 
			driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("inputName")).sendKeys("Shalini");
			
			driver.findElement(By.id("address")).sendKeys("Ram Nagar Colony");
			
			driver.findElement(By.id("city")).sendKeys("Anantapur");
			
			driver.findElement(By.id("state")).sendKeys("Andhra Pradesh");
			
			driver.findElement(By.id("zipCode")).sendKeys("515001");
			
			s=new Select(driver.findElement(By.xpath("//*[@id=\"cardType\"]")));
			s.selectByVisibleText("Visa");
			
			driver.findElement(By.id("creditCardNumber")).sendKeys("12121425152");
			
			driver.findElement(By.id("creditCardMonth")).sendKeys("11");
			
			driver.findElement(By.id("creditCardYear")).sendKeys("2024");
			
			driver.findElement(By.id("nameOnCard")).sendKeys("Shalini");
			
			driver.findElement(By.id("rememberMe")).click();
			
			driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
			
			//Take a ScreenShot
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(f, new File("C:\\Users\\Welcome\\Desktop\\Output ScreenShot\\FlightBooking.png"));
			
			driver.close();
			
		}
	}



