package de;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class windowhandle
{
    public static void main(String[] args) throws InterruptedException
    {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\91909\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
    	 driver.get("https://www.naukri.com/");
    	 driver.manage().window().maximize();
    	 String parentId=driver.getWindowHandle();
    	 System.out.println("parentID is: "+parentId);
    	 driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div[1]/div[1]/ul/li[3]/a/img")).click();
    	 Set<String> str=driver.getWindowHandles();
    	 System.out.println("Total window size: "+str.size());
    	 System.out.println(str);
    	 Iterator<String>itr=str.iterator();
    	 while(itr.hasNext())
    	 {
    		 String childid2=itr.next();
    		 if(!parentId.equalsIgnoreCase(childid2))
    		 {
    			driver.switchTo().window(childid2) ;
    			driver.manage().window().maximize();
    			
    			System.out.println("childwindow title is: "+driver.getTitle());
    			Thread.sleep(3000);
    			driver.close();
    		 }
    	 }
    	driver.switchTo().window(parentId);
    	Thread.sleep(3000);
    	 
    driver.quit();
	}
}
