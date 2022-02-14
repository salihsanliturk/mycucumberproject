//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPageElements {
    @FindBy(
            xpath = "//*[text()='My Operations']"
    )
    public WebElement myOperations;
    @FindBy(
            xpath = "//*[text()='Transfer Money']"
    )
    public WebElement moneyTransferOption;

    public CommonPageElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
