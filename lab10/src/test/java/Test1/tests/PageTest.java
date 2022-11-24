package Test1.tests;

import org.testng.annotations.Test;

public class PageTest extends BaseTest {
    @Test
    public void createNewPaste(){
        mainPage.openPage();
        mainPage.writeTextInToNewPasteField("Hello from WebDriver");
        mainPage.selectPasteExpiration();
        mainPage.writeTextInToPasteNameField("helloweb");
        mainPage.pressCreateNewPasteButton();
    }
}
