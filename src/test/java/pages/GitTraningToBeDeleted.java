package pages;

import org.openqa.selenium.By;

public class GitTraningToBeDeleted {

    private By ClickSignInBtn = By.xpath("//a[contains(text(),'Sign in')]");
    private By AuthenticationPageHeading = By.xpath("//span[contains(text(),'Authentication')]");
    private By UserEmailField = By.id("email_create");
    private By CreateUserAccountBtn = By.id("SubmitCreate");
    private By CreateAccountErrorBox = By.id("create_account_error");

    public void setClickSignInBtn(By clickSignInBtn) {
        ClickSignInBtn = clickSignInBtn;
    }

    public void setAuthenticationPageHeading(By authenticationPageHeading) {
        AuthenticationPageHeading = authenticationPageHeading;
    }

    public void setUserEmailField(By userEmailField) {
        UserEmailField = userEmailField;
    }

    public void setCreateUserAccountBtn(By createUserAccountBtn) {
        CreateUserAccountBtn = createUserAccountBtn;
    }

    public void setCreateAccountErrorBox(By createAccountErrorBox) {
        CreateAccountErrorBox = createAccountErrorBox;
    }
}
