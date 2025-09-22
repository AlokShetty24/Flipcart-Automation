package org.alokshetty.ReusableFunctions;

import com.aventstack.extentreports.reporter.FileUtil;
import net.bytebuddy.implementation.bytecode.Throw;
import org.alokshetty.BaseClass.Library;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class SeleniumReusable extends Library {
    public SeleniumReusable(WebDriver driver)
    {
        this.driver=driver;
    }
    public void enterValue(WebElement element,String text)
    {
        try
        {
            element.sendKeys(text);
        }
        catch (Exception e)
        {
            throw new RuntimeException("No such Element found "+e.getMessage());
        }
    }
    public  void  click(WebElement element)
    {
        try
        {
            element.click();
        }
        catch (Exception e)
        {
            throw new RuntimeException("No such Element found "+e.getMessage());
        }
    }
    public  void  getTitle()
    {
        try
        {
            System.out.println(driver.getTitle());
        }
        catch (Exception e)
        {
            throw new RuntimeException("No Title found "+e.getMessage());
        }
    }
    public void screenShot(String path)
    {
        TakesScreenshot ts =(TakesScreenshot) driver;
        File source= ts.getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile(source,new File(path));
        }
        catch (Exception e)
        {
            throw  new RuntimeException("could not take ScreenShot"+e.getMessage());
        }
    }
}
