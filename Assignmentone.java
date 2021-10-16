package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentone {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("syed");
		driver.findElement(By.name("lastname")).sendKeys("asif");
		driver.findElement(By.name("reg_email__")).sendKeys("9994518032");
		driver.findElement(By.id("password_step_input")).sendKeys("facebook");
		
		WebElement day=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[1]"));
		Select sel=new Select(day);
		sel.selectByIndex(5);
		WebElement month=driver.findElement(By.id("month"));
		Select sel2=new Select(month);
		sel2.selectByIndex(5);
		WebElement year=driver.findElement(By.id("year"));
		Select sel3=new Select(year);
		sel3.selectByIndex(41);
		@SuppressWarnings({ })
	WebElement radio=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[2]/input[1]"));
	radio.click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[10]/button[1]")).click();
    
		
	}

}
