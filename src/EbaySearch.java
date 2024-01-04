import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySearch {

     WebDriver driver;

    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/bhoomikajethwani/Desktop/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://www.ebay.com");

    }

    public void searchButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("gh-ac")).sendKeys("JBL Speakers");
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Daily Deals")).click();

    }

    public void navigate() throws InterruptedException {
        Thread.sleep(1000);
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(1000);
        driver.navigate().back();
        System.out.println("Title of page: " + driver.getTitle() );

    }

    public void closeBrowser() {
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        EbaySearch obj = new EbaySearch();
        obj.launchBrowser();
        obj.searchButton();
        obj.navigate();
        obj.closeBrowser();
        System.out.println("Done!");
    }

}
