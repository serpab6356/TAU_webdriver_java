package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {

   @Test
   public void testFileUpload(){
       var uploadPage = homePage.clickFileUpload();
       uploadPage.uploadFile("/Users/macbookpro/Documents/Automatización/TAU_webdriver_java/resources/chromedriver");
       assertEquals(uploadPage.getUploadFiles(), "chromedriver.exe", "Uploaded files incorrect");

   }
}
