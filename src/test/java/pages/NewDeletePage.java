package pages;

import org.openqa.selenium.By;

public class NewDeletePage {

    private By PrintedDress5099 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[2]/h5[1]/a[1]");
    private By AddToCartBtn = By.xpath("//span[contains(text(),'Add to cart')]");

    public NewDeletePage(By printedDress5099, By addToCartBtn) {
        PrintedDress5099 = printedDress5099;
        AddToCartBtn = addToCartBtn;
    }
}
