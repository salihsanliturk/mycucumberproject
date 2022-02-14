//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MoneyTransferPage {
    @FindBy(
            id = "fromAccountId"
    )
    public WebElement transferFrom;
    @FindBy(
            id = "toAccountId"
    )
    public WebElement transferTo;
    @FindBy(
            id = "balance"
    )
    public WebElement balance;
    @FindBy(
            id = "balancecent"
    )
    public WebElement balanceCent;
    @FindBy(
            id = "description"
    )
    public WebElement description;
    @FindBy(
            id = "make-transfer"
    )
    public WebElement makeTransferButton;
    @FindBy(
            xpath = "//*[text()='Transfer is succesfull']"
    )
    public WebElement successMessageToastContainer;

    public MoneyTransferPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}