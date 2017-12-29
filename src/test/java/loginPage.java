import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    WebDriver loginPageDriver;

    By emailBy = By.id("identifierId");

    @FindBy(id = "identifierId")
    public WebElement email;

    @FindBy(xpath = "//span[@class='RveJvd snByac']")
    public WebElement nextButton;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//div[contains(text(),'COMPOSE')]")
    public WebElement composeButton;

    @FindBy(xpath = "//textarea[@rows='1']")
    public WebElement recepient;

    @FindBy(xpath = "//input[@name='subjectbox']")
     public WebElement subject;

    @FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")
     public WebElement send;

    loginPage(WebDriver driverParam){
        this.loginPageDriver = driverParam;
        PageFactory.initElements(loginPageDriver, this);
    }

    public void loginToGmail(String emailParam,String pwd) throws Exception{
        email.sendKeys(emailParam);
        nextButton.click();
        Thread.sleep(2000);
        password.sendKeys(pwd);
        nextButton.click();
    }

    public void composeMail(String mailaddr,String sub) throws Exception{
        composeButton.click();
        recepient.sendKeys(mailaddr);
        subject.sendKeys(sub);
        send.click();
    }

    public boolean ismsgDisplayed(){
        boolean display = email.isDisplayed();
        return display;
    }

}
