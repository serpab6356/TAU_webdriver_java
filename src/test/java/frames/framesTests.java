package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class framesTests extends BaseTest {

    @Test
    public void testWysywg(){
        var editorPage = homePage.clickWysinwygEditor();
        editorPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "World";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFormEditor(), text1+text2, "Text from editor is incorrect");

    }
}
