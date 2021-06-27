import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class BasePage {

    public WebDriver driver;

    //Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(String pageTitle) {
        return pageTitle;
    }

    public void maximize(){
        driver.manage().window().maximize();
    }

    public void minimize(){
        driver.manage().window().setPosition(new Point(0, -2000));
    }
}