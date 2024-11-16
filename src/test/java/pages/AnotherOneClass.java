package pages;

import org.openqa.selenium.By;

public class AnotherOneClass {

    private By UserEmailValidationField = By.id("email");
    private By EnterPassword = By.id("passwd");
    private By DatePicker_Day = By.id("days");
    private By DatePicker_Month = By.id("months");
    private By DatePicker_Year = By.id("years");

    public AnotherOneClass(By userEmailValidationField, By enterPassword, By datePicker_Day, By datePicker_Month, By datePicker_Year) {
        UserEmailValidationField = userEmailValidationField;
        EnterPassword = enterPassword;
        DatePicker_Day = datePicker_Day;
        DatePicker_Month = datePicker_Month;
        DatePicker_Year = datePicker_Year;
    }

    public By getUserEmailValidationField() {
        return UserEmailValidationField;
    }

    public void setUserEmailValidationField(By userEmailValidationField) {
        UserEmailValidationField = userEmailValidationField;
    }

    public By getEnterPassword() {
        return EnterPassword;
    }

    public void setEnterPassword(By enterPassword) {
        EnterPassword = enterPassword;
    }

    public By getDatePicker_Day() {
        return DatePicker_Day;
    }

    public void setDatePicker_Day(By datePicker_Day) {
        DatePicker_Day = datePicker_Day;
    }

    public By getDatePicker_Month() {
        return DatePicker_Month;
    }

    public void setDatePicker_Month(By datePicker_Month) {
        DatePicker_Month = datePicker_Month;
    }

    public By getDatePicker_Year() {
        return DatePicker_Year;
    }

    public void setDatePicker_Year(By datePicker_Year) {
        DatePicker_Year = datePicker_Year;
    }
}
