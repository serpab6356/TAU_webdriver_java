package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-summit");
    private By uploadFiles = By.id("uploaded-files");


    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clicUploadButton (){
        driver.findElement(uploadButton).click();
    }

    /*
    * Provides path of file to the form then clicks Upload button
    * @param absolutePathOfFile the complete path of the file to upload
    * */

    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clicUploadButton();
    }

    public String getUploadFiles(){
        return driver.findElement(uploadFiles).getText();
    }







}
