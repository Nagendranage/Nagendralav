package POM_pageobjectmodel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom_OrangeHRM {
	
	//Maximize windows and delete allcookies
	public void setup(WebDriver driver) {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	//URL
	public void url(WebDriver driver) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	//Username
	public void username(WebDriver driver, String usn) {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(usn);
	}
	//Password
	public void password(WebDriver driver, String pwd) {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(pwd);
	}
	//Login
	public void login(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	//WelcomeAdmin
	public void welcomeAdmin(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
	}
	//logout
	public void logout(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	}
	//close driver
	public void closedriver(WebDriver driver) {
		driver.close();
	}

}



