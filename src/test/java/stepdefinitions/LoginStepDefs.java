//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import pages.CommonPageElements;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    CommonPageElements commonPageElements = new CommonPageElements();

    public LoginStepDefs() {
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
    }

    @Given("user clicks on login dropdown")
    public void user_clicks_on_login_dropdown() {
        this.loginPage.loginDropdown.click();
    }

    @Given("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        this.loginPage.signInButton.click();
    }

    @Given("user sends username {string}")
    public void user_sends_username(String string) {
        this.loginPage.username.sendKeys(new CharSequence[]{string});
    }

    @Given("user sends password {string}")
    public void user_sends_password(String string) {
        this.loginPage.password.sendKeys(new CharSequence[]{string});
    }

    @Given("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        this.loginPage.loginButton.click();
    }

    @Given("user enters admin_id and admin_password")
    public void user_enters_admin_id_and_admin_password(DataTable credentials) {
        List<Map<String, String>> adminCredentials = credentials.asMaps(String.class, String.class);
        System.out.println(adminCredentials);
        Iterator var3 = adminCredentials.iterator();

        while(var3.hasNext()) {
            Map<String, String> eachCredentials = (Map)var3.next();
            this.loginPage.username.sendKeys(new CharSequence[]{(CharSequence)eachCredentials.get("admin_username")});
            this.loginPage.password.sendKeys(new CharSequence[]{(CharSequence)eachCredentials.get("admin_password")});
        }

    }

    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {
        Driver.wait(1);
        Assert.assertTrue(this.commonPageElements.myOperations.isDisplayed());
    }
}
