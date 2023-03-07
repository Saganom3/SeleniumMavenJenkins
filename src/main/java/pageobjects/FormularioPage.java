package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FormularioPage {
    private WebDriver driver;

    private By INPUTFIRSTNAME = By.id("first-name");
    private By INPUTLASTNAME = By.id("last-name");
    private By RDBLEVELEDUCATION = By.id("radio-button-1");

    public void firstNameInput(String name) throws InterruptedException {
        WebElement firstNameInput = driver.findElement(INPUTFIRSTNAME);
        firstNameInput.sendKeys(name);
    }

    @Deprecated
    public void lastNameInput(String lastName) throws InterruptedException {
        WebElement firstNameInput = driver.findElement(INPUTLASTNAME);
        firstNameInput.sendKeys(lastName);
    }

    public void rbnLevelEducation() throws InterruptedException {
        WebElement levelEducation = driver.findElement(RDBLEVELEDUCATION);
        levelEducation.click();
    }

    /*Contructor*/
    public FormularioPage(WebDriver driver) {
        this.driver = driver;
    }

}
