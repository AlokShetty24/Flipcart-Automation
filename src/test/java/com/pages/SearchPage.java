package com.pages;

import org.alokshetty.BaseClass.Library;
import org.alokshetty.ReusableFunctions.SeleniumReusable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Library {
    SeleniumReusable seleniumReusable =new SeleniumReusable(driver);
    public SearchPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='q']")
    WebElement Searchtext;

    @FindBy(xpath = "//html[@lang='en-IN']")
    WebElement  HomePage;

    @FindBy(xpath = "//html[@class='en-fonts-loaded']")
    WebElement SearchResult;
    public void Search(String text)
    {
        seleniumReusable.enterValue( Searchtext,text);
    }

    public void clickSearch()
    {
        Searchtext.sendKeys(Keys.ENTER);
    }
    public void HomeScreen()
    {
        System.out.println(HomePage.isDisplayed());
    }
    public void Result()
    {
        System.out.println(SearchResult.isDisplayed());
        System.out.println(driver.getTitle());

    }
}
