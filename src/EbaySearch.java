import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySearch {

     WebDriver driver;

    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/bhoomikajethwani/Desktop/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://www.youtube.com");



    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        EbaySearch obj = new EbaySearch();
        obj.launchBrowser();
        System.out.println("Hello world!");
    }

}
