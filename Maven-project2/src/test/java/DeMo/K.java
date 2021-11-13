package DeMo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class K 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	System.setProperty("webdriver.edge.driver","C:\\Users\\91909\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    	WebDriver driver=new EdgeDriver();
    	 driver.get("https://www.drishtiias.com/");
    	 driver.manage().window().maximize();
    	  driver.findElement(By.xpath(" //a[@class=\"register popup cboxElement\"]")).click();
    	  Thread.sleep(2000);
    	  driver.findElement(By.id("//input[@id=\"txtrname\"]")).click();
    	  Thread.sleep(2000);
    	  driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Mahesh");
    	  Thread.sleep(2000);
    	  driver.findElement(By.xpath("(//button[@type=\"button\"])[15]")).click();
    	  Thread.sleep(2000);	
    	  driver.findElement(By.xpath("(//button[@class=\"ripple\"])[1]")).click();
    	  Thread.sleep(2000);
    	  driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
    	  Thread.sleep(2000);
    	 
    	 
    	 driver.get("https://www.amazon.in/");
    	Thread.sleep(2000);
    	 driver.findElement(By.xpath("//input[@type=\"text\"]")).click();
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("one plus 9r");
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[2]")).click();
    	 Thread.sleep(2000);
    	driver.findElement(By.xpath("(//span[@class=\"a-button-inner\"])[53]/i/following-sibling::input/following-sibling::span")).click();
    	 Thread.sleep(2000);
    	// driver.findElement(By.xpath("(//span[@class=\"a-size-base\"])[11]")).click();
    	 driver.close();
	}
}
