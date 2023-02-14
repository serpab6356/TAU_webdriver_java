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

    public DropdownPage clicDropDown(){
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

    public FileUploadPage clicFileUpload(){
        clicLink("File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage clicWysinwygEditor(){
        clicLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }




    public void clicLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


}
