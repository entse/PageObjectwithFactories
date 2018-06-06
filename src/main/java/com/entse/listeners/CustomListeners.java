package com.entse.listeners;


import com.entse.base.Page;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.*;
import com.entse.utilities.MonitoringMail;
import com.entse.utilities.TestConfig;
import com.entse.utilities.Utilities;

import javax.mail.MessagingException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class CustomListeners extends Page implements ITestListener, ISuiteListener {

    public void onTestStart(ITestResult result) {
        test = rep.startTest(result.getName().toUpperCase());
        //runmodes - Y
        if (!Utilities.isTestRunnable(result.getName(), excel)){
            throw new SkipException("Skipping the test " + result.getName().toUpperCase() + " cause RunMode is set to NO");
        }
    }

    public void onTestSuccess(ITestResult result) {

        test.log(LogStatus.PASS, result.getName().toUpperCase()+" PASS");
        rep.endTest(test);
        rep.flush();
    }

    public void onTestFailure(ITestResult result) {

        System.setProperty("org.uncommons.reportng.escape-output", "false");
        try {
            Utilities.captureScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
        test.log(LogStatus.FAIL, result.getName().toUpperCase()+" Failed with exception: " + result.getThrowable());
        test.log(LogStatus.INFO, test.addScreenCapture(Utilities.screenshotName));

        Reporter.log("Click to see Screenshot");
        Reporter.log("<a target =\"_blank\" href="+Utilities.screenshotName+">Screenshot</a>");
        Reporter.log("<br>");
        Reporter.log("<br>");
        Reporter.log("<a target =\"_blank\" href="+Utilities.screenshotName+"><img src="+Utilities.screenshotName+" height=200 weight=200></img></a>");
        rep.endTest(test);
        rep.flush();
    }

    public void onTestSkipped(ITestResult result) {

        test.log(LogStatus.SKIP, result.getName().toUpperCase() + "Skipped the test cause RunMode is set to NO");
        rep.endTest(test);
        rep.flush();
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {


    }

    public void onFinish(ITestContext context) {

    }

    @Override
    public void onStart(ISuite suite) {

    }

    @Override
    public void onFinish(ISuite suite) {

        /*MonitoringMail mail = new MonitoringMail();
        String messageBody = null;
        try {
            messageBody = "http://" + InetAddress.getLocalHost().getHostAddress() + ":8080/job/Page%20Object%20Model/Extent_20Report/";
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        try {
            mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);
        } catch (MessagingException e) {
            e.printStackTrace();
        }*/
    }
}
