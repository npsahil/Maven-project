package Code.Code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lets_code {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		 * driver.get("http://demo.testfire.net/login.jsp"); Thread.sleep(2000);
		 * driver.close(); driver.findElement(By.id("uid")).sendKeys("jsmith");
		 * driver.findElement(By.name("pass")).sendKeys("demo1234");
		 * driver.findElement(By.name("btnSubmit")).click();
		 */
		/*
		 * driver.get("https://magento.softwaretestingboard.com/"); Thread.sleep(2000);
		 * driver.findElement(By.linkText("Sign In")).click(); Thread.sleep(5000);
		 * driver.findElement(By.id("email")).sendKeys("test1605@test.com");
		 * Thread.sleep(5000); driver.findElement(By.id("pass")).sendKeys("test1234");
		 * driver.findElement(By.id("send2")).click();
		 */
	/*	driver.get("http://altoro.testfire.net/bank/.jsp");
		Thread.sleep(2000);
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		Thread.sleep(2000);
		driver.findElement(By.name("passw")).sendKeys("demo1234");
		Thread.sleep(2000);
		driver.findElement(By.name("btnSubmit")).click(); 
		Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("View Recent")).click();
		 Thread.sleep(3000);
	*/
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(2000);
		 WebElement c=driver.findElement(By.xpath("(//td[text()='5000'])[1]"));
	String str=c.getText();
	System.out.println(str);
	}

}
