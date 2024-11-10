package pages;

import org.openqa.selenium.By;

public class DeletePage1 {

    private By ClickSignInBtn = By.xpath("//a[contains(text(),'Sign in')]");
    private By AuthenticationPageHeading = By.xpath("//span[contains(text(),'Authentication')]");
    private By UserEmailField = By.id("email_create");
    private By CreateUserAccountBtn = By.id("SubmitCreate");
    private By CreateAccountErrorBox = By.id("create_account_error");
    private By DatePicker_Day = By.id("days");

    public By getClickSignInBtn() {
        return ClickSignInBtn;
    }

    public void setClickSignInBtn(By clickSignInBtn) {
        ClickSignInBtn = clickSignInBtn;
    }

    public By getCreateAccountErrorBox() {
        return CreateAccountErrorBox;
    }

    public void setCreateAccountErrorBox(By createAccountErrorBox) {
        CreateAccountErrorBox = createAccountErrorBox;
    }

    public By getCreateUserAccountBtn() {
        return CreateUserAccountBtn;
    }

    public void setCreateUserAccountBtn(By createUserAccountBtn) {
        CreateUserAccountBtn = createUserAccountBtn;
    }

    public By getUserEmailField() {
        return UserEmailField;
    }

    public void setUserEmailField(By userEmailField) {
        UserEmailField = userEmailField;
    }

    public By getAuthenticationPageHeading() {
        return AuthenticationPageHeading;
    }

    public void setAuthenticationPageHeading(By authenticationPageHeading) {
        AuthenticationPageHeading = authenticationPageHeading;
    }

    public By getDatePicker_Day() {
        return DatePicker_Day;
    }

    public void setDatePicker_Day(By datePicker_Day) {
        DatePicker_Day = datePicker_Day;
    }
}