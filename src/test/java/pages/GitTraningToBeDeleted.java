package pages;

import org.openqa.selenium.By;

public class GitTraningToBeDeleted {

    private By ClickSignInBtn = By.xpath("//a[contains(text(),'Sign in')]");
    private By AuthenticationPageHeading = By.xpath("//span[contains(text(),'Authentication')]");
    private By UserEmailField = By.id("email_create");
    private By CreateUserAccountBtn = By.id("SubmitCreate");
    private By CreateAccountErrorBox = By.id("create_account_error");
    private By PrintedDress5099 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[2]/h5[1]/a[1]");

    public By getClickSignInBtn() {
        return ClickSignInBtn;
    }

    public void setClickSignInBtn(By clickSignInBtn) {
        ClickSignInBtn = clickSignInBtn;
    }

    public By getAuthenticationPageHeading() {
        return AuthenticationPageHeading;
    }

    public void setAuthenticationPageHeading(By authenticationPageHeading) {
        AuthenticationPageHeading = authenticationPageHeading;
    }

    public By getUserEmailField() {
        return UserEmailField;
    }

    public void setUserEmailField(By userEmailField) {
        UserEmailField = userEmailField;
    }

    public By getCreateUserAccountBtn() {
        return CreateUserAccountBtn;
    }

    public void setCreateUserAccountBtn(By createUserAccountBtn) {
        CreateUserAccountBtn = createUserAccountBtn;
    }

    public By getCreateAccountErrorBox() {
        return CreateAccountErrorBox;
    }

    public void setCreateAccountErrorBox(By createAccountErrorBox) {
        CreateAccountErrorBox = createAccountErrorBox;
    }

    public By getPrintedDress5099() {
        return PrintedDress5099;
    }

    public void setPrintedDress5099(By printedDress5099) {
        PrintedDress5099 = printedDress5099;
    }
}
