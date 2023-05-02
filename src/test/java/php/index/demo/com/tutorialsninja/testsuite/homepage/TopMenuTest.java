package php.index.demo.com.tutorialsninja.testsuite.homepage;

import org.testng.Assert;
import org.testng.annotations.Test;
import php.index.demo.com.tutorialsninja.pages.ComponentsPage;
import php.index.demo.com.tutorialsninja.pages.DesktopPage;
import php.index.demo.com.tutorialsninja.pages.HomePage;
import php.index.demo.com.tutorialsninja.pages.LaptopAndNoteBookPage;
import php.index.demo.com.tutorialsninja.testbase.BaseTest;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopAndNoteBookPage laptopAndNoteBookPage = new LaptopAndNoteBookPage();
    ComponentsPage componentsPage = new ComponentsPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //click on desktop dropdown
        homePage.mouseHoverAndClickOnDesktop();
        //select show all desktops
        homePage.selectMenu("Show All Desktops");
        String expectedDesktop = "Desktops";
        String actualDesktop = desktopPage.getDesktopText();
        //verify if user is navigated to the correct page
        Assert.assertEquals(actualDesktop, expectedDesktop, "Desktop not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //click on laptops and notebooks dropdown
        homePage.mouseHoverAndClickOnLaptopsAndNotebooks();
        //select show all laptops and notebooks
        homePage.selectMenu("Show All Laptops & Notebooks");
        String expectedLaptopsAndNotebooks = "Laptops & Notebooks";
        String actualLaptopsAndNotebooks = laptopAndNoteBookPage.getLaptopAndNoteBookText();
        //verify if user is navigated to the correct page
        Assert.assertEquals(actualLaptopsAndNotebooks, expectedLaptopsAndNotebooks, "Laptops And Notebooks not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //click on components dropdown
        homePage.mouseHoverAndClickOnComponents();
        //select show all components
        homePage.selectMenu("Show All Components");
        String expectedComponents = "Components";
        String actualComponents = componentsPage.getComponentsText();
        //verify if user is navigated to the correct page
        Assert.assertEquals(actualComponents, expectedComponents, "Components Page not displayed");
    }
}
