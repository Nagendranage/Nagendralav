package Assainments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_NavigateBack {

	public static void main(String[] args) throws InterruptedException {
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
		//Click All--open menu
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[1]/a")).click();
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		//Digital Content And Devices 
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/ul[1]/li[6]/div")).getText());
		
		for(int i=7;i<=12;i++) {
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li["+i+"]/a")).getText());
			Thread.sleep(2000);
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li["+i+"]/a"))).click().perform();
			Thread.sleep(2000);
			driver.findElement(By.linkText("MAIN MENU")).click();
			Thread.sleep(2000);
		}
		driver.close();
	}
	
	

}
