import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReportBasicDemo {

    private static WebDriver driver = null;

    public static void main(String[] args) {
        ExtentHtmlReporter  htmlReporter = new ExtentHtmlReporter("extentReports.html");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test = extent.createTest("Test1: Google Search", "Description here");

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver.exe");//Windows
        //System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver");//Linux
        driver = new ChromeDriver();

        test.log(Status.INFO, "Starting test case");
        driver.get("https://google.com");
        test.pass("Opened Google.com");


        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
        test.pass("Enter search text");

        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        test.pass("Hit Enter");

        driver.close();
        driver.quit();
        test.pass("Closed the browser");

        test.info("Test case completed");

        ExtentTest test2 = extent.createTest("Test2: Google Search", "Description here");
        //System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver.exe");//Windows
        System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver");//Linux
        driver = new ChromeDriver();

        test2.log(Status.INFO, "Starting test case");
        driver.get("https://google.com");
        test2.pass("Opened Google.com");


        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
        test2.pass("Enter search text");

        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        test2.fail("Hit Enter");

        driver.close();
        driver.quit();
        test2.pass("Closed the browser");

        test2.info("Test case completed");

        extent.flush();


    }
}
