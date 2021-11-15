package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Iterator;
import java.util.Set;

import static framework.base.DriverContext.driver;

public class Registration {
    private By ClickSignInBtn = By.xpath("//a[contains(text(),'Sign in')]");
    private By AuthenticationPageHeading = By.xpath("//span[contains(text(),'Authentication')]");
    private By UserEmailField = By.id("email_create");
    private By CreateUserAccountBtn = By.id("SubmitCreate");
    private By CreateAccountErrorBox = By.id("create_account_error");
    //Create an Account/Personal information section page elements
    private By ClickGenderBtn_Male = By.id("id_gender1");
    private By ClickGenderBtn_FeMale = By.id("id_gender2");
    private By EnterUserF_Name = By.id("customer_firstname");
    private By EnterUserL_Name = By.id("customer_lastname");
    private By UserEmailValidationField = By.id("email");
    private By EnterPassword = By.id("passwd");
    private By DatePicker_Day = By.id("days");
    private By DatePicker_Month = By.id("months");
    private By DatePicker_Year = By.id("years");
    private By NewsletterChkBox = By.id("newsletter");
    private By OptinChkBox = By.id("optin");
    //Create an Account/Address details section page elements
    private By FirstNameField = By.id("firstname");
    private By LastNameField = By.id("lastname");
    private By CompanyField = By.id("company");
    private By Address1Field = By.id("address1");
    private By Address2Field = By.id("address2");
    private By CityField = By.id("city");
    private By StateField = By.id("id_state");
    private By PostCodeField = By.id("postcode");
    private By CountryField = By.id("id_country");
    private By AdditionalInfoField = By.id("other");
    private By HomeTelField = By.id("phone");
    private By MobTelField = By.id("phone_mobile");
    private By AddressAliasField = By.id("alias");

    private By ClickRegisterBtn = By.id("submitAccount");

    //My account page after successful account creation
    private By AccountNameText = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");


    //Shopping cart operation elements
    private By PrintedDress5099 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[2]/h5[1]/a[1]");
    private By AddToCartBtn = By.xpath("//span[contains(text(),'Add to cart')]");
    private By ClickCartMenuBtn = By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]");
    private By PdressImageInCart = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]");
    private By GetCartQuantity = By.xpath("//tbody/tr[@id='product_4_16_0_0']/td[5]/input[2]");
    private By CartQtyMinusBtn = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/a[1]/span[1]");
    private By CartStatusBar = By.xpath("//p[contains(text(),'Your shopping cart is empty.')]");
    private By clickProceedToCheckoutBtn = By.xpath("//a[@class='btn btn-default button button-medium']");







    //HomePage methods to capture elements
    public void setClickSignInBtn(){
        driver.findElement(ClickSignInBtn).click();
    }


    //Registration page methods
    public void accountCreationPage(){
        String A_Title = driver.getTitle();
        System.out.println("The displayed page title is " + A_Title);
        String E_Title = "Login - My Store";
        Assert.assertEquals(A_Title, E_Title);

        String A_HeadingText = driver.findElement(AuthenticationPageHeading).getText();
        String E_HeadingText = "Authentication";
        System.out.println("The displayed Authentication page heading is: " + E_HeadingText);
        Assert.assertEquals(E_HeadingText, A_HeadingText);
    }

    public  void setAuthenticationPageHeading(){
        String A_HeadingText = driver.findElement(AuthenticationPageHeading).getText();

    }
    public void setUserEmailField(String email){
        driver.findElement(UserEmailField).sendKeys(email);
    }
    public void setCreateUserAccountBtn(){
        driver.findElement(CreateUserAccountBtn).click();
    }
    public boolean getCreateAccountError(){
        boolean E_ErrorTextBox = driver.findElement(CreateAccountErrorBox).isDisplayed();
        Assert.assertTrue(true);
        return E_ErrorTextBox;

    }

    //Create an account/Personal Information page methods

    public void setClickGenderBtn_Male(){

        new WebDriverWait(driver, 80).until(ExpectedConditions.elementToBeClickable(ClickGenderBtn_Male)).click();
    }
    public void setClickGenderBtn_FeMale(){
        driver.findElement(ClickGenderBtn_FeMale).click();
    }
    public void setEnterUserF_Name(String firstName){
        driver.findElement(EnterUserF_Name).sendKeys(firstName);
    }
    public void setEnterUserL_Name(String lastName){
        driver.findElement(EnterUserL_Name).sendKeys(lastName);
    }
    public void getUserEmailValidationField(){
       String emailTxt = driver.findElement(UserEmailValidationField).getAttribute("value");
       System.out.println("The prior entered email currently displayed in the email field is " + emailTxt);

    }
    public void setEnterPassword(String password){
        driver.findElement(EnterPassword).sendKeys(password);
    }
    public void setDatePicker_Day(){
        WebElement locator = driver.findElement(DatePicker_Day);
        locator.click();
        Select objSelect = new Select(locator);
        objSelect.selectByIndex(3);
    }
    public void setDatePicker_Month(){
        WebElement locator = driver.findElement(DatePicker_Month);
        locator.click();
        Select objSelect = new Select(locator);
        objSelect.selectByValue("6");
    }
    public void setDatePicker_Year(){
        WebElement locator = driver.findElement(DatePicker_Year);
        locator.click();
        Select objSelect = new Select(locator);
        objSelect.selectByValue("1993");
    }
    public void setNewsletterChkBox(){
        WebElement newschkbox = driver.findElement(NewsletterChkBox);
        newschkbox.click();
        System.out.println(newschkbox.isSelected());
    }
    public void setOptinChkBox(){
        WebElement optinchkbox = driver.findElement(OptinChkBox);
        optinchkbox.click();
        System.out.println(optinchkbox.isSelected());
    }

    //Create an Account/Address details section methods
    public void setFirstNameField(String first_name){
        driver.findElement(FirstNameField).sendKeys(first_name);
    }
    public void setLastNameField(String last_Name){
        driver.findElement(LastNameField).sendKeys(last_Name);
    }
    public void setAddress1Field(String address){
        driver.findElement(Address1Field).sendKeys(address);
    }
    public void setCompanyField(String company){
        driver.findElement(CompanyField).sendKeys(company);
    }
    public void setAddress2Field(String address2){
        driver.findElement(Address2Field).sendKeys(address2);
    }
    public void setCityField(String city){
        driver.findElement(CityField).sendKeys(city);
    }
    public void setStateField(){
        WebElement locator = driver.findElement(StateField);
        Select objSelector = new Select(locator);
        locator.click();
        objSelector.selectByVisibleText("Georgia");
    }
    public void setPostCodeField(String postcode){
        driver.findElement(PostCodeField).sendKeys(postcode);
    }
    public void setCountryField(){
        WebElement locator = driver.findElement(CountryField);
        Select objSelector = new Select(locator);
        locator.click();
        objSelector.selectByValue("21");
    }
    public void setAdditionalInfoField(String add_info){
        driver.findElement(AdditionalInfoField).sendKeys(add_info);
    }
    public void setHomeTelField(String homeTel){
        driver.findElement(HomeTelField).sendKeys(homeTel);
    }
    public void setMobTelField(String mobTel){
        driver.findElement(MobTelField).sendKeys(mobTel);
    }
    public void setAddressAliasField(String myaddAlias){
        driver.findElement(AddressAliasField).sendKeys(myaddAlias);
    }
    public void setClickRegisterBtn(){
        driver.findElement(ClickRegisterBtn).click();
    }

    //User account page after account creation
    public void setAccountNameText(){
        String elementText = driver.findElement(AccountNameText).getText();
        String E_Text = "charles Cooper";
        Assert.assertEquals(E_Text, elementText);
        System.out.println("Name of logged in user displayed is " + elementText);

    }

    //Shopping Cart operation items - methods
    public void setPrintedDress5099() throws InterruptedException, AWTException {
        driver.findElement(PrintedDress5099).click();
        Thread.sleep(3000);
        }
    public void setAddToCartBtn() throws InterruptedException {
        new WebDriverWait(driver, 80).until(ExpectedConditions.elementToBeClickable(AddToCartBtn)).click();
        //driver.findElement(AddToCartBtn).click();

    }
    public void cancelAlert() throws InterruptedException, AWTException {
/*        String parentWin = driver.getWindowHandle();
        System.out.println("Parent window id is: " + parentWin);
        Set<String> windows = driver.getWindowHandles();
        int count = windows.size();
        System.out.println("Total number of windows is: " + count);
        Iterator<String> it = windows.iterator();
        while ((it.hasNext())){
            String childWin = it.next();
            if (!parentWin.equals(childWin)){
                driver.switchTo().window(childWin);
                //driver.findElement(clickProceedToCheckoutBtn).click();
                Thread.sleep(4000);
            }
        }
*/

        String window = driver.getWindowHandle();
        for(String windHandle : driver.getWindowHandles()){
            driver.switchTo().window(windHandle);
            System.out.println("Switch was successful");
            driver.findElement(clickProceedToCheckoutBtn).click();
        }



    }

    public void setClickCartMenuBtn(){
        driver.findElement(ClickCartMenuBtn).click();
    }
    public void setClickProceedToCheckoutBtn(){
        driver.findElement(clickProceedToCheckoutBtn);
    }
    public void getOrderPageTitle(){
        String orderPageTitle = driver.getTitle();
        String ExpectedTitle = "Order - My Store";
        System.out.println("The title of the current page displayed is: " + orderPageTitle);
        Assert.assertEquals(orderPageTitle,ExpectedTitle);
    }
    public boolean PresenceOfPDress(){
        boolean CartImage = driver.findElement(PdressImageInCart).isDisplayed();
        Assert.assertTrue(true);
        return CartImage;
    }
    public void GetCartItemsNum(){
        String cartVol = driver.findElement(GetCartQuantity).getAttribute("value");
        System.out.println("The number of items in cart is: " + cartVol);
    }
    public void setCartQtyMinusBtn(){
        driver.findElement(CartQtyMinusBtn).click();
    }
    public void setCartStatusBar(){
        String cart_Status = driver.findElement(CartStatusBar).getText();
        System.out.println("The cart status bar displays message: " + cart_Status);

    }

}
