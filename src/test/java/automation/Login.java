package automation;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//password
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	
		//login
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();	
		
		//add to cart
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[2]/button")).click();
		
		//shopping cart
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		
		//checkout
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
		//First Name
		driver.findElement(By.id("first-name")).sendKeys("Maliha");
		
		//Last Name
		driver.findElement(By.id("last-name")).sendKeys("Mehjabin");
		
		//zip code
		driver.findElement(By.id("postal-code")).sendKeys("1207");
		
		//continue
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		//finish
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();		
		
		//driver.quit();
	}

}
