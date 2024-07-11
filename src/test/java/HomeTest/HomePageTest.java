package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {


    @Test
    public void HomePageLoginMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
//        homepage.SearchBar();
//        homepage.SearchData();
        Thread.sleep(2000);
//        homepage.learnBtn();
        Thread.sleep(2000);


    }
    @Test
    public void BootCampsMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguage();
        Thread.sleep(2000);
        homepage.CoursesTab();
        homepage.ScrollToPosition(0,600);
        Thread.sleep(5000);
//
//        homepage.Fillter();
//        homepage.FillterSearchBar();
//        Thread.sleep(2000);
//        homepage.ClickOnDropDown();
//        homepage.SelectDropDown();
//test
//        Thread.sleep(5000);



    }


}




