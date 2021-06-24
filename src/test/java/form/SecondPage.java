package form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {

    @FindBy(xpath = "//*[normalize-space(text()) = \"Zgody\"]")
    WebElement titleText;

    WebDriver driver;

    public SecondPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
