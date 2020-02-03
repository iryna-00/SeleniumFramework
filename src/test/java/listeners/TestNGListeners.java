package listeners;

import org.testng.*;

public class TestNGListeners implements ITestListener, ISuiteListener {


    public void onTestStart(ITestResult iTestResult) {
        System.out.println("*********Test Started : " + iTestResult.getName());

    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("*********Test is successful : " + iTestResult.getName());

    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("*********Test failed : " + iTestResult.getName());

    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("*********Test skipped : " + iTestResult.getName());

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("*********Test Completed : " + iTestContext.getName());

    }

    public void onStart(ISuite iSuite) {

    }

    public void onFinish(ISuite iSuite) {

    }
}
