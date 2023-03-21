package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clicLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers(){
        clicLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clicLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clicLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clicLink("File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage clickWysinwygEditor(){
        clicLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clicLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clicLink("Ininite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clicLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public DynamicLoadingExample1Page clickDynamicLoadingEx1(){
        clicLink("Dynamic Loading");
        return new DynamicLoadingExample1Page(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        clicLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }


    public void clicLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


}
