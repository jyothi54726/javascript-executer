package jsExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExecutor {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://183.82.125.5/nareshit/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		WebElement element=driver.findElement(By.name("Submit"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);
		Thread.sleep(3000);
		System.out.println("Login completed");
		WebElement logout=driver.findElement(By.linkText("Logout"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",logout);
		System.out.println("Logout completed");
		driver.close();
	}
}
