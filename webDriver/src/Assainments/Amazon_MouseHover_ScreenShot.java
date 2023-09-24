package Assainments;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Amazon_MouseHover_ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		Select s;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Wait
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//URL
		driver.get("https://www.amazon.in/");
		
		//Dropdown-->select "Software"
		s=new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		s.selectByVisibleText("Software");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(2000);
		
		//Actions class is used for mouse Actions
		Actions a=new Actions(driver);
		//List
		List<WebElement>ls=driver.findElements(By.xpath("/html/body/div[1]/header/div/div[6]/div/a"));
		
		int size=ls.size();
		System.out.println("No of Elements:"+size);
		
		for(int i=1;i<=size;i++) {
			Thread.sleep(3000);
			
			//GET text of the element
			System.out.println(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[6]/div/a["+i+"]")).getText());
			
			//MouseHover All elements ofSofware
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[6]/div/a["+i+"]"))).click().perform();
			//Screenshot
			
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(file, new File("C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\SS["+i+"].jpg"));
		}
		//Close the browser
		driver.close();
	}

}




