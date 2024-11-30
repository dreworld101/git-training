package pages;

import org.openqa.selenium.By;

public class MakeSureIsDeleted {

    private By ClickSignInButton = By.xpath("//a[contains(text(),'Sign in')]");
    private By AuthenticationPageHeadingTxt = By.xpath("//span[contains(text(),'Authentication')]");
    private By UserEmailFieldTxt = By.id("email_create");
    private By CreateUserAccountButton = By.id("SubmitCreate");
    private By CreateAccountErro = By.id("create_account_error");
    private By DatePickerDay = By.id("days");

    public By getClickSignInButton() {
        return ClickSignInButton;
    }

    public void setClickSignInButton(By clickSignInButton) {
        ClickSignInButton = clickSignInButton;
    }

    public By getAuthenticationPageHeadingTxt() {
        return AuthenticationPageHeadingTxt;
    }

    public void setAuthenticationPageHeadingTxt(By authenticationPageHeadingTxt) {
        AuthenticationPageHeadingTxt = authenticationPageHeadingTxt;
    }

    public By getUserEmailFieldTxt() {
        return UserEmailFieldTxt;
    }

    public void setUserEmailFieldTxt(By userEmailFieldTxt) {
        UserEmailFieldTxt = userEmailFieldTxt;
    }

    public By getCreateUserAccountButton() {
        return CreateUserAccountButton;
    }

    public void setCreateUserAccountButton(By createUserAccountButton) {
        CreateUserAccountButton = createUserAccountButton;
    }

    public By getCreateAccountErro() {
        return CreateAccountErro;
    }

    public void setCreateAccountErro(By createAccountErro) {
        CreateAccountErro = createAccountErro;
    }

    public By getDatePickerDay() {
        return DatePickerDay;
    }

    public void setDatePickerDay(By datePickerDay) {
        DatePickerDay = datePickerDay;
    }
}