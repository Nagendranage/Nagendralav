package Assainments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Amazon_CheckBox_Filter {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Wait
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//URL
		driver.get("https://www.amazon.in/");
		Select s=new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		s.selectByVisibleText("Books");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Software Testing Books");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(2000);
		
		//Check Box-- Get it by Tomorrow
		driver.findElement(By.xpath("//*[@id=\"p_90/6741118031\"]/span/a/div/label/i")).click();
		Thread.sleep(2000);
		
		//Customer Reviews 4-5
		driver.findElement(By.xpath("//*[@id=\"p_72/1318476031\"]/span/a/section/i")).click();
		Thread.sleep(2000);
		
		//Select hardcover check box
		driver.findElement(By.xpath("//*[@id=\"p_n_binding_browse-bin/1318375031\"]/span/a/div/label/i")).click();
		Thread.sleep(2000);
		
		//Manually entering Min price
		driver.findElement(By.xpath("//*[@id=\"low-price\"]")).sendKeys("500");
		driver.findElement(By.xpath("//*[@id=\"a-autoid-1\"]/span/input")).click();
		Thread.sleep(2000);
		
		//ScreenShot
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\sreenu\\Desktop\\Automation\\Browser extension\\Filter_SS.png"));
		
		driver.close();

	}

}




