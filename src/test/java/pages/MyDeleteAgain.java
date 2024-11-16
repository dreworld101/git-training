package pages;

import org.openqa.selenium.By;

public class MyDeleteAgain {

    private By FirstNameField = By.id("firstname");
    private By LastNameField = By.id("lastname");
    private By CompanyField = By.id("company");
    private By Address1Field = By.id("address1");
    private By Address2Field = By.id("address2");
    private By CityField = By.id("city");
    private By StateField = By.id("id_state");
    private By PostCodeField = By.id("postcode");

    public By getFirstNameField() {
        return FirstNameField;
    }

    public void setFirstNameField(By firstNameField) {
        FirstNameField = firstNameField;
    }

    public By getLastNameField() {
        return LastNameField;
    }

    public void setLastNameField(By lastNameField) {
        LastNameField = lastNameField;
    }

    public By getCompanyField() {
        return CompanyField;
    }

    public void setCompanyField(By companyField) {
        CompanyField = companyField;
    }

    public By getAddress1Field() {
        return Address1Field;
    }

    public void setAddress1Field(By address1Field) {
        Address1Field = address1Field;
    }

    public By getAddress2Field() {
        return Address2Field;
    }

    public void setAddress2Field(By address2Field) {
        Address2Field = address2Field;
    }

    public By getCityField() {
        return CityField;
    }

    public void setCityField(By cityField) {
        CityField = cityField;
    }

    public By getStateField() {
        return StateField;
    }

    public void setStateField(By stateField) {
        StateField = stateField;
    }

    public By getPostCodeField() {
        return PostCodeField;
    }

    public void setPostCodeField(By postCodeField) {
        PostCodeField = postCodeField;
    }
}
