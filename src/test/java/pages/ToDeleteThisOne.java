package pages;

import org.openqa.selenium.By;

public class ToDeleteThisOne {

    private By AdditionalInfoField = By.id("other");
    private By HomeTelFld = By.id("phone");
    private By MobTelFields = By.id("phone_mobile");
    private By AddressAliasField = By.id("alias");

    public By getAdditionalInfoField() {
        return AdditionalInfoField;
    }

    public By getHomeTelField() {
        return HomeTelFld;
    }

    public By getMobTelField() {
        return MobTelFields;
    }

    public By getAddressAliasField() {
        return AddressAliasField;
    }
}
