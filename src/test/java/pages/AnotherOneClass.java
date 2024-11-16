package pages;

import org.openqa.selenium.By;

public class AnotherOneClass {

    private By signInButton = By.xpath("//a[contains(text(),'Sign in')]");
    private By pageHeadingText = By.xpath("//span[contains(text(),'Authentication')]");
    private By emailFld = By.id("email_create");
    private By userAccountButton = By.id("SubmitCreate");

    public By getSignInButton() {
        return signInButton;
    }

    public void setSignInButton(By signInButtonn) {
        this.signInButton = signInButtonn;
    }

    public By getPageHeadingText() {
        return pageHeadingText;
    }

    public void setPageHeadingText(By pageHeadingText) {
        this.pageHeadingText = pageHeadingText;
    }

    public By getEmailFld() {
        return emailFld;
    }

    public void setEmailFld(By emailFld) {
        this.emailFld = emailFld;
    }

    public By getUserAccountButton() {
        return userAccountButton;
    }

    public void setUserAccountButton(By userAccountButton) {
        this.userAccountButton = userAccountButton;
    }
}
