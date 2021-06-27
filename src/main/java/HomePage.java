import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage extends BasePage {

    @FindBy(css = "#pageFooter > ul > li:nth-child(2) > a")
    WebElement lngEnglishElm;

    public void clickOnLng() {
        lngEnglishElm.click();
    }

    @FindBy(linkText = "Create New Account")
    WebElement createAnAccDisplay;

    public void createAnAccDisplay() {
        createAnAccDisplay.isDisplayed();
        createAnAccDisplay.click();
    }

    @FindBy(name = "firstname")
    WebElement firstName;

    public void firstName(String firstName) {
        this.firstName.clear();
        this.firstName.sendKeys(firstName);
    }

    @FindBy(name = "lastname")
    WebElement lastName;

    public void lastName(String lastName) {
        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }

    @FindBy(name = "reg_email__")
    WebElement email;

    public void email(String phone) {
        this.email.clear();
        this.email.sendKeys(phone);
    }

    @FindBy(id = "password_step_input")
    WebElement password;

    public void password(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    @FindBy(id = "month")
    WebElement month;

    public void month() {
        Select monthDate = new Select(month);
        monthDate.selectByVisibleText("May");
    }

    @FindBy(id = "day")
    WebElement day;

    public void day() {
        Select dayDate = new Select(day);
        dayDate.selectByVisibleText("24");
    }

    @FindBy(id = "year")
    WebElement year;

    public void year() {
        Select yearDate = new Select(year);
        yearDate.selectByVisibleText("2001");
    }

    @FindBy(css = "input[name='sex'][value='2']")
    WebElement gender;

    public void gender() {
        gender.click();
    }

    @FindBy(name = "websubmit")
    WebElement signUp;

    public void signUp() {
        signUp.click();
    }

    //Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Page Variables
    String firstBaseURL = "https://qatechhub.com";
    String secondBaseURL = "https://www.fb.com";


    //Page Methods
    //Go to Homepage
    public HomePage goToURL() {
        driver.get(firstBaseURL);
        return this;
    }

    public HomePage goToURL2() {
        driver.get(secondBaseURL);
        return this;
    }
}