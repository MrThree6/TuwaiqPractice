package Pages;

// Import necessary classes from Selenium and TestNG
import ObjectsPath.TestHome;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    // Method to open GitHub homepage
    public void OpenUrl (){
        driver.get("https://tuwaiq.edu.sa/"); // Navigate to GitHub URL
    }
        public void ChangeLanguage() {
        WebElement english = driver.findElement(language); // Find login button element
        english.click(); // Click on the login button
    }
    public void CoursesTab() {
        WebElement Coursetab = driver.findElement(courseTab); // Find login button element
        Coursetab.click(); // Click on the login button
    }

    public void Fillter() {
        WebElement FillterButton = driver.findElement(fillter); // Find login button element
        FillterButton.click(); // Click on the login button
    }

    public void FillterSearchBar() {
        driver.findElement(fillterSearch).sendKeys("m");
//        driver.findElement(fillterSearch).sendKeys(Keys.RETURN);
    }

    public void ClickOnDropDown() {
        driver.findElement(regionDropDown).click();
//ggggggg

    }

    public void SelectDropDown() {
        driver.findElement(clickRiyadh).click();

    }

    public void ScrollToPosition(int x, int y) {
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0],arguments[1]);",x,y);

    }



    //below is for udacity

//    // Method to click on the login button on the home page
//    public void SearchBar() {
//        WebElement searchIcon = driver.findElement(searchBarElement); // Find login button element
//        searchIcon.click(); // Click on the login button
//    }
//
//    // Method to enter login credentials and verify login
//    public void SearchData () throws InterruptedException {
//        driver.findElement(searchInputBar).sendKeys("Data"); // Find email address field and enter email
//        Thread.sleep(3000); // Pause execution for 3000 milliseconds (not recommended; use explicit waits instead)
//        driver.findElement(searchInputBar).sendKeys(Keys.RETURN); // Find password field and enter password
////        driver.findElement(signInBtn).click(); // Click on sign-in button
////
////        boolean homepageview = driver.findElement(assertionUponLogin).isDisplayed(); // Check if assertion element is displayed
////        Assert.assertTrue(homepageview, "home page is not displayed!"); // Assert that homepageview is true
//    }
//
//    public void learnBtn(){
//       driver.findElement(learnBtnElement).click(); // Find login button element
//
//    }
}
