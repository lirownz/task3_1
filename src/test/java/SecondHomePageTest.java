import org.testng.Assert;
import org.testng.annotations.*;


public class SecondHomePageTest extends BaseTest {

    private HomePage homePage;

    @BeforeClass
    public void setup() {
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void setupMethod() {
        homePage.goToURL2();
    }

    @Test(priority = 1)
    public void checkRedirectingURL() {
        //making sure we are on the US version site
        homePage.clickOnLng();
        //checking assertion to the current url
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
    }

    @Test(priority = 2)
    public void checkingCreateAnAcc() {
        //checking if the create account is up and displayed
        homePage.createAnAccDisplay();
    }

    //fill in the registration form
    @Test(priority = 3 , dataProvider="testdata")
    public void registartion(String firstName, String lastName, String phone, String password){
        //enter the registration page
        homePage.createAnAccDisplay();
        //fill first name
        homePage.firstName(firstName);
        //fill sure name
        homePage.lastName(lastName);
        //fill email
        homePage.email(phone);
        //fill new password
        homePage.password(password);
        //fill birth month
        homePage.month();
        //fill birth day
        homePage.day();
        //fill birth year
        homePage.year();
        //select gender
        homePage.gender();
        //clicking signUp button
        homePage.signUp();
    }
    @DataProvider(name="testdata")
        public Object[][] TestDataFeed() {
            return new Object[][]{
                    {"EwaveFirst", "EwaveLast", "0509998888", "EwavePass"}
            };
    }
}


