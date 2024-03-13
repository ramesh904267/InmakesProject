package org.tng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SnapDeal {
	public static void main(String[] args) throws IOException {
        

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ramesh S\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.snapdeal.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='keyword']"));
        searchBox.sendKeys("hand sanitizer");
        // Wait for the page to load
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement product = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']"));
        product.click();
        WebElement addtoCartBtn = driver.findElement(By.xpath("//img[@class='product-image ']"));
        addtoCartBtn.click();
        Set<String> windowHandles = driver.getWindowHandles();
    	List<String> handles=new ArrayList<String>(windowHandles );
    	driver.switchTo().window(handles.get(1));
    	System.out.println(driver.getTitle());
     	
    	WebElement addToCartBtn = driver.findElement(By.xpath("(//span[@class='intialtext'])[1]"));
    	 addToCartBtn.click();
    	driver.switchTo().window(handles.get(0));
    	System.out.println(driver.getTitle());

    	     	 driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-cart-icon-white-2']")).click();
        
         // Take a screenshot of the cart page
         File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try {
             FileUtils.copyFile(screenshot, new File("D:\\workspace\\TestNgProject\\SnapdealScreenShot.png"));
         } catch (IOException e) {
             e.printStackTrace();
         }



	
		
	}
}

