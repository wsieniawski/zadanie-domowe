package form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {

    @FindBy(xpath = "//*[normalize-space(text()) = \"Dane podstawowe\"]")
    WebElement titleText;
    @FindBy(id="id_first_name")
    WebElement nameField;
    @FindBy(id="id_last_name")
    WebElement surnameField;
    @FindBy(xpath="//*[@id=\"id_email\"]")
    WebElement emailField;
    @FindBy(name="phone")
    WebElement phoneField;
    @FindBy(id="id_pesel")
    WebElement peselField;
    @FindBy(id="id_id_numer")
    WebElement serialField;
    @FindBy(id="id_date")
    WebElement birthDateField;
    @FindBy(id="form_button_next")
    WebElement nextPageButton;

    WebDriver driver;

    public FirstPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterTextIntoField(String text, WebElement field) {
        field.sendKeys(text);
    }

    public void enterNumberIntoField(Long number, WebElement field) {
        field.sendKeys(String.valueOf(number));
    }


    public void clickNextButton() {
        nextPageButton.click();
    }

    public void hideDatePicker() {
        //date picker is over next page button so wee need hide it
        //easiest way I guess is to click somewhere else
        nameField.click();
    }

}
