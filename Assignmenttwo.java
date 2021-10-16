package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmenttwo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("syed");
		driver.findElement(By.name("UserLastName")).sendKeys("asif");
		driver.findElement(By.name("UserEmail")).sendKeys("qwett@gmil.com");
	WebElement s1=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/select[1]"));
		Select sel=new Select(s1);
		sel.selectByIndex(1);
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		
	WebElement ce=driver.findElement(By.name("CompanyEmployees"));
	Select sel1=new Select(ce);
	sel1.selectByIndex(2);
	driver.findElement(By.name("UserPhone")).sendKeys("+919994518032");
	
	WebElement cc=driver.findElement(By.name("CompanyCountry"));
	Select sel2=new Select(cc);
	sel2.selectByValue("India");
	
	WebElement chk=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]"));
		chk.click();	
	}
}