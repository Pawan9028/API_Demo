package com.API_Demo.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import org.testng.ITestContext;

public class TestReporterListener implements ITestListener {
	ExtentSparkReporter spark = new ExtentSparkReporter("target/SparkReport.html");
	ExtentReports extent = new ExtentReports();
	ExtentTest test;
	
	 public void onTestStart(ITestResult result) {
		 test = extent.createTest(result.getMethod().getMethodName());
	    }
	 public void onTestSuccess(ITestResult result) {
	        test.pass("Test passed");
	    }

	    public void onTestFailure(ITestResult result) {
	        test.fail("Test failed");
	    }

	    public void onFinish(ITestContext context) {
	        extent.attachReporter(spark);
	        extent.flush();
	    }

}
