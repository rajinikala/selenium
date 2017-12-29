import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class gmailTest
{
    public WebDriver initialsteps()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com/");
        return driver;
    }

    @Test(enabled = true)
    public void loginTest() throws Exception
    {
        WebDriver driver;
        driver=initialsteps();
        driver.get("https://www.gmail.com/");
        loginPage obj = new loginPage(driver);
        obj.loginToGmail("rajnikala.g","r@jinikal@");
        //driver.quit();
    }

    @Test
    public void newMessage() throws Exception
    {
        WebDriver driver;
        driver=initialsteps();
        loginPage obj = new loginPage(driver);
        obj.loginToGmail("rajnikala.g","r@jinikal@");
        Thread.sleep(5000);
        obj.composeMail("karthikvn23@gmail.com","Hi, How r u");


    }
}
