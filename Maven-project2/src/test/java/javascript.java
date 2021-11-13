import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\91909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 JavascriptExecutor js=( JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,700)", " ");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,-700)", " ");
		 Thread.sleep(3000);
		 driver.get("https://login.yahoo.com/");
		 WebElement username=driver.findElement(By.name("username"));
		js.executeScript("arguments[0].value='maheshtandale@gmail.com'",username);
		//js.executeScript("document.getElementByName('username').value='maheshtandale@gmail.com'");
		 Thread.sleep(3000);
		 driver.close();
   }
}
