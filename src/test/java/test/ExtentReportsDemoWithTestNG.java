package test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class ExtentReportsDemoWithTestNG {
    private ExtentHtmlReporter htmlReporter;
    private ExtentReports extent;
    private WebDriver driver;

    @BeforeSuite
    public void setUp(){
        htmlReporter = new ExtentHtmlReporter("extentReports2.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

    }

    @BeforeTest
    public void setUpTest(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver.exe");//Windows
        //System.setProperty("webdriver.chrome.driver", projectPath +"/Drivers/chromeriver/chromedriver");//Linux
        driver = new ChromeDriver();
    }

    @Test
    public void test1() throws IOException {


        ExtentTest test = extent.createTest("Test2: Google Search with TestNG", "Description here");
        driver.get("https://google.com");
        test.pass("Opened Google.com");
        test.log(Status.INFO, "This is INFO");
        //info details:
        test.info("INFO details");

        //log with snapshot
        test.pass("FAIL details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        // adding screenshots to test
        test.pass("details").addScreenCaptureFromPath("screenshot.png");
    }

    @AfterTest
    public void tearDownTest(){
        driver.close();
        System.out.println("Test Completed Successfully");


    }

    @AfterSuite
    public void tearDown(){
        extent.flush();

    }


}
