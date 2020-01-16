package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

    private WebDriver driver = null;

    public GoogleSearchPageObjects(WebDriver driver){
        this.driver = driver;
    }

    By textbox_search = By.name("q");
    By button_search = By.name("q");

    public void setTextbox_serch(String text){
        driver.findElement(textbox_search).sendKeys(text);
    }

    public void clickButton_search(){
        driver.findElement(button_search).sendKeys(Keys.RETURN);
    }
}
