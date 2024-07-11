package ObjectsPath;

// Import necessary classes from Selenium
import org.openqa.selenium.By;


// Define the TestHome class
public class TestHome {

    // Locator for the login button in the home page
    public static final By language = By.xpath("/html/body/main/div/nav[2]/div[2]/button[1]");

    public static final By courseTab = By.xpath("/html/body/main/div/nav[2]/div[1]/div/div/ul/li[2]/a");

    public static final By fillter = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[1]/button");

    public static final By fillterSearch = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");

    public static final By regionDropDown = By.xpath("//*[@id='regionSelect']");

    public static final By clickRiyadh = By.xpath("//*[@id='regionSelect']/option[2]");

    public static final By clickProgram = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[2]/button[2]\n");

    //// Below is for udacity
//    // Locator for the email address input field in the login form
//    public static final By searchInputBar = By.xpath("//*[@id='app-header']/div[1]/div[2]/div[2]/div/div/div/input");
//
//    // Locator for the password input field in the login form
//    public static final By learnBtnElement = By.xpath("//button[@id='popover-trigger-:rc:']");
//
//    // Locator for the sign in button in the login form
//    public static final By signInBtn = By.xpath("//*[@id='login']/div[4]/form/div/input[13]");
//
//    // Locator for an element to assert upon successful login
//    public static final By assertionUponLogin = By.xpath("//*[@id='dashboard']/div/feed-container/div[1]/div/a");


}
