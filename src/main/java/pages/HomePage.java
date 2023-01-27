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

    public void clicLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


}
