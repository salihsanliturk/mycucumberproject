package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPageElements;
import pages.MoneyTransferPage;

public class RegisterationStepDefs {
    CommonPageElements commonPageElements = new CommonPageElements();
    MoneyTransferPage moneyTransferPage = new MoneyTransferPage();

    @Given("user clicks on my operations")
    public void user_clicks_on_my_operations() {
        commonPageElements.myOperations.click();

    }
    @Given("user clicks on transfer money")
    public void user_clicks_on_transfer_money() {
        commonPageElements.moneyTransferOption.click();

    }
    @When("user select the current account to transfer money from")
    public void user_select_the_current_account_to_transfer_money_from() {

    }
    @When("user select the other account to transfer money to")
    public void user_select_the_other_account_to_transfer_money_to() {

    }
    @When("user provides the balance {string}")
    public void user_provides_the_balance(String string) {

    }
    @When("user types the description")
    public void user_types_the_description() {

    }
    @Then("user makes the money transfer and verify success message")
    public void user_makes_the_money_transfer_and_verify_success_message() {

    }
}