import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ProgressNetBG {
    WebDriver driver;


    public void sendKeysWithJavaScript(String text, WebElement element) { //JavaScript sendkeys method
        JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
        try {
            myExecutor.executeScript("arguments[0].value='" + text + "';", element);
        } catch (Exception e) {
        }

    }

    @BeforeClass
    public void startBrowser() {
        //Define driver as a Chromedriver
        driver = new ChromeDriver();

        //Maximize the browser
        driver.manage().window().maximize();

        driver.navigate().to("https://progressbg.net/");

    }

    @Test
    public void clickNachaloBtn() {
        WebElement nachalo = driver.findElement(By.id("menu-item-2912"));
        String nachaloText = nachalo.getText();
        System.out.println(nachaloText);
        nachalo.click();

    }

    @Test
    public void clickZaNas() {
        WebElement zaNas = driver.findElement(By.cssSelector("#menu-item-2554"));
        String zaNasText = zaNas.getText();
        System.out.println(zaNasText);
        zaNas.click();
    }

    @Test
    public void clickKursove() {
        WebElement kursove = driver.findElement(By.cssSelector("#menu-item-5671"));
        String kursoveText = kursove.getText();
        System.out.println(kursoveText);
        kursove.click();
    }

    @Test
    public void clickFirmeni() {
        WebElement firmeni = driver.findElement(By.cssSelector("#menu-item-7724"));
        String firmeniText = firmeni.getText();
        System.out.println(firmeniText);
        firmeni.click();
    }

    @Test
    public void clickCeni() {
        WebElement ceni = driver.findElement(By.cssSelector("#menu-item-2527"));
        String ceniText = ceni.getText();
        System.out.println(ceniText);
        ceni.click();

    }

    @Test
    public void clickGrafik() {
        WebElement grafik = driver.findElement(By.cssSelector("#menu-item-5471"));
        String grafikText = grafik.getText();
        System.out.println(grafikText);
        grafik.click();

    }

    @Test
    public void clickPartniori() {
        WebElement partniori = driver.findElement(By.cssSelector("#menu-item-8581"));
        String partnioriText = partniori.getText();
        System.out.println(partnioriText);
        partniori.click();

    }

    @Test
    public void clickContacts() {
        WebElement contacts = driver.findElement(By.cssSelector("#menu-item-2868"));
        String contactsText = contacts.getText();
        System.out.println(contactsText);
        contacts.click();
    }

    @Test
    public void clickSearchAndFind() {
        WebElement searchBtn = driver.findElement(By.cssSelector("#wrap > div.nav-wrap.clearfix > div > div > div.searchlens"));
        searchBtn.click();
        WebElement inputSearchField = driver.findElement(By.cssSelector("#s"));
        sendKeysWithJavaScript("3D Studio Max", inputSearchField);
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
