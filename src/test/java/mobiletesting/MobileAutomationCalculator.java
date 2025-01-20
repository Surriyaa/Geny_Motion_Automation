package mobiletesting;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileAutomationCalculator {
    public AndroidDriver driver;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName","192.168.66.103:5555");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appium:appPackage","com.example.calculator");
        capabilities.setCapability("appium:appActivity","com.tree.calculator.MainActivity");
        capabilities.setCapability("appium:platformVersion","13.0");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        System.out.println("Automation Started");
    }
    @Test(priority = 0)
    public void addition() throws InterruptedException {
        Thread.sleep(2000);
        WebElement five =driver.findElement(By.id("com.example.calculator:id/tvFive"));
        five.click();
        Thread.sleep(2000);
        WebElement plus=driver.findElement(By.id("com.example.calculator:id/tvPlus"));
        plus.click();
        Thread.sleep(2000);
        WebElement eight =driver.findElement(By.id("com.example.calculator:id/tvEight"));
        eight.click();
        Thread.sleep(2000);
        WebElement equal=driver.findElement(By.id("com.example.calculator:id/tvEquals"));
        equal.click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.example.calculator:id/tvClear")).click();

    }
    @Test(priority = 1)
    public void subraction() throws InterruptedException {
        Thread.sleep(2000);
        WebElement five =driver.findElement(By.id("com.example.calculator:id/tvFive"));
        five.click();
        Thread.sleep(2000);
        WebElement minus =driver.findElement(By.id("com.example.calculator:id/tvMinus"));
        minus.click();
        Thread.sleep(2000);
        WebElement eight =driver.findElement(By.id("com.example.calculator:id/tvEight"));
        eight.click();
        Thread.sleep(2000);
        WebElement equal=driver.findElement(By.id("com.example.calculator:id/tvEquals"));
        equal.click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.example.calculator:id/tvClear")).click();

    }
    @Test(priority = 2)
    public void multiplication() throws InterruptedException {
        Thread.sleep(2000);
        WebElement five =driver.findElement(By.id("com.example.calculator:id/tvFive"));
        five.click();
        Thread.sleep(2000);
        WebElement mult=driver.findElement(By.id("com.example.calculator:id/tvMul"));
        mult.click();
        Thread.sleep(2000);
        WebElement num2=driver.findElement(By.id("com.example.calculator:id/tvFive"));
        num2.click();
        Thread.sleep(2000);
        WebElement equal=driver.findElement(By.id("com.example.calculator:id/tvEquals"));
        equal.click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.example.calculator:id/tvClear")).click();

    }
    @Test(priority = 3)
    public void division() throws InterruptedException {
        Thread.sleep(2000);
        WebElement num1=driver.findElement(By.id("com.example.calculator:id/tvEight"));
        num1.click();
        Thread.sleep(2000);
        WebElement divide =driver.findElement(By.id("com.example.calculator:id/tvDivide"));
        divide.click();
        Thread.sleep(2000);
        WebElement num2=driver.findElement(By.id("com.example.calculator:id/tvTwo"));
        num2.click();
        Thread.sleep(2000);
        WebElement equal=driver.findElement(By.id("com.example.calculator:id/tvEquals"));
        equal.click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.example.calculator:id/tvClear")).click();

    }
}
