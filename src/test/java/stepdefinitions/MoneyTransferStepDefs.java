//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import pages.CommonPageElements;
import pages.MoneyTransferPage;
import utilities.Driver;

public class MoneyTransferStepDefs {
    CommonPageElements commonPageElements = new CommonPageElements();
    MoneyTransferPage moneyTransferPage = new MoneyTransferPage();

    public MoneyTransferStepDefs() {
    }

    @Given("user clicks on my operations")
    public void user_clicks_on_my_operations() {
        Driver.waitAndClick(this.commonPageElements.myOperations);
    }

    @Given("user clicks on transfer money")
    public void user_clicks_on_transfer_money() {
        Driver.waitAndClick(this.commonPageElements.moneyTransferOption);
    }

    @When("user select the current account to transfer money from")
    public void user_select_the_current_account_to_transfer_money_from() {
        Driver.wait(1);
        Driver.selectByIndex(this.moneyTransferPage.transferFrom, 1);
    }

    @When("user select the other account to transfer money to")
    public void user_select_the_other_account_to_transfer_money_to() {
        Driver.selectByIndex(this.moneyTransferPage.transferTo, 1);
    }

    @When("user provides the balance {string}")
    public void user_provides_the_balance(String string) {
        Driver.waitAndSendText(this.moneyTransferPage.balance, string);
        Driver.waitAndSendText(this.moneyTransferPage.balanceCent, "2");
    }

    @When("user types the description")
    public void user_types_the_description() {
        Driver.waitAndSendText(this.moneyTransferPage.description, "Transferring between my accounts");
    }

    @Then("user makes the money transfer and verify success message")
    public void user_makes_the_money_transfer_and_verify_success_message() throws IOException {
        Driver.waitAndClick(this.moneyTransferPage.makeTransferButton);
        Driver.wait(1);
        Assert.assertTrue(this.moneyTransferPage.successMessageToastContainer.isDisplayed());
        System.out.println(this.moneyTransferPage.successMessageToastContainer.getText());
        File successImage = (File)this.moneyTransferPage.successMessageToastContainer.getScreenshotAs(OutputType.FILE);
        File path = new File("successMessage.png");
        FileUtils.copyFile(successImage, path);
    }
}
