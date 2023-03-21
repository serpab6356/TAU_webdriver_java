package Wait;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickExample1();

    }

    @Test
    public void testWaitUntilHiddenEx1(){
        var loadingPageEx1 = homePage.clickDynamicLoadingEx1();
        loadingPageEx1.clickStart();
        assertEquals(loadingPageEx1.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
