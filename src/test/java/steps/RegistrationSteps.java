package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LandingPage;
import pages.Registration;

public class RegistrationSteps {
    LandingPage landingPage = new LandingPage();
    Registration newuser = new Registration();

    @Given("User is on the home page of {string} website")
    public void userIsOnTheHomePageOfWebsite(String arg0) {
        landingPage.launchBaseUrl();
    }

    @When("User clicks the Sign in button")
    public void userClicksTheSignInButton() {
        newuser.setClickSignInBtn();
    }

    @And("The website Authentication page is displayed")
    public void theWebsiteAuthenticationPageIsDisplayed() {
        newuser.accountCreationPage();

    }

    @And("Enters a previously registered {string} address in the CREATE AN ACCOUNT section")
    public void entersAPreviouslyRegisteredAddressInTheCREATEANACCOUNTSection(String used_email) {
        newuser.setUserEmailField(used_email);
    }

    @And("Clicks the Create an account button")
    public void clicksTheCreateAnAccountButton() {
        newuser.setCreateUserAccountBtn();
    }

    @Then("An error warning is displayed informing user that email address is previously registered")
    public void anErrorWarningIsDisplayedInformingUserThatEmailAddressIsPreviouslyRegistered() {
        newuser.getCreateAccountError();
    }

    @When("User enters a previously unregistered {string} address in the CREATE AN ACCOUNT section")
    public void userEntersAPreviouslyUnregisteredAddressInTheCREATEANACCOUNTSection(String email) {
        newuser.setClickSignInBtn();
        newuser.setUserEmailField(email);
    }
    @And("clicks the CREATE AN ACCOUNT button")
    public void clicksTheCREATEANACCOUNTButton() {
        newuser.setCreateUserAccountBtn();
    }

    @And("Enters their Personal Information details {string}, {string}, {string}")
    public void entersTheirPersonalInformationDetails(String firstName, String lastName, String password) throws InterruptedException {
        newuser.setClickGenderBtn_Male();
        newuser.setEnterUserF_Name(firstName);
        Thread.sleep(3000);
        newuser.setEnterUserL_Name(lastName);
        newuser.getUserEmailValidationField();
        newuser.setEnterPassword(password);
        newuser.setDatePicker_Day();
        newuser.setDatePicker_Month();
        newuser.setDatePicker_Year();
        newuser.setNewsletterChkBox();
        newuser.setOptinChkBox();
    }
/*    @And("Enter their Address details {string}, {string} {string}, {string}, {string}, {string}, {string}, {string} {string}, {string}, {string}")
    public void enterTheirAddressDetails(String first_Name, String last_Name, String company, String address, String address2, String city, String postalCode, String add_info, String homeTel, String mobTel, String addAlias) throws InterruptedException {
        newuser.setFirstNameField(first_Name);
        newuser.setLastNameField(last_Name);
        Thread.sleep(2000);
        newuser.setCompanyField(company);
        Thread.sleep(2000);
        newuser.setAddress1Field(address);
        Thread.sleep(2000);
        newuser.setAddress2Field(address2);
        Thread.sleep(2000);
        newuser.setCityField(city);
        Thread.sleep(2000);
        newuser.setStateField();
        Thread.sleep(2000);
        newuser.setPostCodeField(postalCode);
        Thread.sleep(2000);
        newuser.setCountryField();
        Thread.sleep(2000);
        newuser.setAdditionalInfoField(add_info);
        Thread.sleep(2000);
        newuser.setHomeTelField(homeTel);
        Thread.sleep(2000);
        newuser.setMobTelField(mobTel);
        Thread.sleep(2000);
        newuser.setAddressAliasField(addAlias);
        Thread.sleep(2000);
    }

*/


    @Then("User account is successfully created after clicking Register button")
    public void userAccountIsSuccessfullyCreatedAfterClickingRegisterButton() {
        newuser.setClickRegisterBtn();
        newuser.setAccountNameText();
    }


    @And("Enter their Address details {string}, {string} {string}, {string}, {string}, {string}, {string}, {string} {string}, {string}, {string}, {string}")
    public void enterTheirAddressDetails(String firstName, String lastName, String company, String address, String address2, String city, String postalCode, String add_info, String homeTel, String mobTel, String addAlias, String myaddAlias) throws InterruptedException {
        newuser.setFirstNameField(firstName);
        newuser.setLastNameField(lastName);
        Thread.sleep(2000);
        newuser.setCompanyField(company);
        Thread.sleep(2000);
        newuser.setAddress1Field(address);
        Thread.sleep(2000);
        newuser.setAddress2Field(address2);
        Thread.sleep(2000);
        newuser.setCityField(city);
        Thread.sleep(2000);
        newuser.setStateField();
        Thread.sleep(2000);
        newuser.setPostCodeField(postalCode);
        Thread.sleep(2000);
        newuser.setCountryField();
        Thread.sleep(2000);
        newuser.setAdditionalInfoField(add_info);
        Thread.sleep(2000);
        newuser.setHomeTelField(homeTel);
        Thread.sleep(2000);
        newuser.setMobTelField(mobTel);
        Thread.sleep(2000);
        newuser.setAddressAliasField(myaddAlias);
        Thread.sleep(2000);
    }
}
