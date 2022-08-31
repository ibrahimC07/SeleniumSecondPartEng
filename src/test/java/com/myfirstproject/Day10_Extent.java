package com.myfirstproject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import utilities.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day10_Extent extends TestBase {
    protected ExtentReports extentReports;
    protected ExtentHtmlReporter extentHtmlReporter;
    protected ExtentTest extentTest;

    @Test
    public void ExtentReportsTest(){
        String currentTime=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir") + "/test-output/reports/" + currentTime + "test_report.html";

        extentHtmlReporter=new ExtentHtmlReporter(path);

        extentReports=new ExtentReports();

        extentReports.setSystemInfo("Test Environment","Regression");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Team","Eagles");

        extentHtmlReporter.config().setDocumentTitle("TechProEd home page");
        extentHtmlReporter.config().setReportName("TechProEd Extent reports");
        extentHtmlReporter.config().setReportName("TechProEd home page");
        extentHtmlReporter.config().setDocumentTitle("TechProEd extent reports");
//        ********************

//        DONE WITH CONFIGURATION
        extentReports.attachReporter(extentHtmlReporter);

//        REPORT IS DONE. NOW CREATING EXTENT TEST TO LOG INFO IN THE TEST CASE

//        Creating extent test
        extentTest= extentReports.createTest("My Extent Reporter","Regression Test Report");

        extentTest.pass("going to the app url");
        driver.get("https:www.amazon.com");
        extentReports.flush();

    }

}
