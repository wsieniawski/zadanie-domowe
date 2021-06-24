package form;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

public class FormStepDefinitions {

    WebDriver driver = null;
    FirstPage first;
    SecondPage second;

    @Given("Browser is open")
    public void browserIsOpen() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Given("I am on first page of form")
    public void i_am_on_first_page_of_form() {
        first = new FirstPage(driver);
        driver.get("https://app.bluealert.pl/ba/form/formularz-testowy");
        assertThat(first.titleText.isDisplayed());
    }

    @When("I enter (.*) into name field")
    public void i_enter_name_into_name_field(String name) {
        first = new FirstPage(driver);
        first.enterTextIntoField(name, first.nameField);
    }

    @When("I enter (.*) into surname field")
    public void i_enter_surname_into_surname_field(String surname) {
        first = new FirstPage(driver);
        first.enterTextIntoField(surname, first.surnameField);
    }

    @When("I enter (.*) into email field")
    public void i_enter_email_gmail_com_into_email_field(String email) {
        first = new FirstPage(driver);
        first.enterTextIntoField(email, first.emailField);
    }

    @When("I enter {long} into phone field")
    public void i_enter_into_phone_field(Long phone) {
        first = new FirstPage(driver);
        first.enterNumberIntoField(phone, first.phoneField);
    }

    @When("I enter {long} into PESEL field")
    public void i_enter_into_PESEL_field(Long pesel) {
        first = new FirstPage(driver);
        first.enterNumberIntoField(pesel, first.peselField);
    }

    @When("I enter (.*) into serial field")
    public void i_enter_serial_into_serial_field(String serial) {
        first = new FirstPage(driver);
        first.enterTextIntoField(serial, first.serialField);
    }

    @When("I enter (.*) into birth date field")
    public void i_enter_into_birth_date_field(String date) {
        first = new FirstPage(driver);
        first.enterTextIntoField(date, first.birthDateField);
        first.hideDatePicker();
    }

    @And("I click Next Page button")
    public void iClickNextPageButton() {
        first = new FirstPage(driver);
        first.clickNextButton();
    }

    @Then("I am on second page")
    public void i_am_on_second_page() {
        second = new SecondPage(driver);
        assertThat(second.titleText.isDisplayed());
    }
}
