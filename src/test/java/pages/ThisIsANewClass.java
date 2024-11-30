package pages;

import org.openqa.selenium.By;

public class ThisIsANewClass {

    private By ClickSignInButton = By.xpath("//a[contains(text(),'Sign in')]");
    private By AuthenticationPageHeader = By.xpath("//span[contains(text(),'Authentication')]");
    private By UserEmailFld = By.id("email_create");
    private By CreateUserAccountButton = By.id("SubmitCreate");
    private By CreateAccountError = By.id("create_account_error");

    public By getClickSignInButton() {
        return ClickSignInButton;
    }

    public void setClickSignInButton(By clickSignInButton) {
        ClickSignInButton = clickSignInButton;
    }

    public By getAuthenticationPageHeader() {
        return AuthenticationPageHeader;
    }

    public void setAuthenticationPageHeader(By authenticationPageHeader) {
        AuthenticationPageHeader = authenticationPageHeader;
    }

    public By getUserEmailFld() {
        return UserEmailFld;
    }

    public void setUserEmailFld(By userEmailFld) {
        UserEmailFld = userEmailFld;
    }

    public By getCreateUserAccountButton() {
        return CreateUserAccountButton;
    }

    public void setCreateUserAccountButton(By createUserAccountButton) {
        CreateUserAccountButton = createUserAccountButton;
    }

    public By getCreateAccountError() {
        return CreateAccountError;
    }

    public void setCreateAccountError(By createAccountError) {
        CreateAccountError = createAccountError;
    }
}
