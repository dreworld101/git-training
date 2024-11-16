package pages;

import org.openqa.selenium.By;

public class ToDeleteThisOne {

    private By AdditionalInfoField = By.id("other");
    private By HomeTelField = By.id("phone");
    private By MobTelField = By.id("phone_mobile");
    private By AddressAliasField = By.id("alias");

    public By getAdditionalInfoField() {
        return AdditionalInfoField;
    }

    public By getHomeTelField() {
        return HomeTelField;
    }

    public By getMobTelField() {
        return MobTelField;
    }

    public By getAddressAliasField() {
        return AddressAliasField;
    }
}
