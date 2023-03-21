package Dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTest {
    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();

        String option = "Option 2";
        dropDownPage.selectFromDropdown(option);
        var selectOptions = dropDownPage.getSelectedOption();
        assertEquals(selectOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectOptions.contains(option), "Option not selected");

        System.out.println(selectOptions);
    }

}
