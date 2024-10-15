
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.context.TestCaseContext

import com.kms.katalon.core.context.TestSuiteContext



def static "sample.Common.createNewUser"(
    	int age	
     , 	String username	
     , 	String password	
     , 	String gender	
     , 	int expectedStatus	) {
    (new sample.Common()).createNewUser(
        	age
         , 	username
         , 	password
         , 	gender
         , 	expectedStatus)
}


def static "sample.Common.findUserById"(
    	int id	
     , 	int age	
     , 	String username	
     , 	String password	
     , 	String gender	
     , 	int expectedStatus	) {
    (new sample.Common()).findUserById(
        	id
         , 	age
         , 	username
         , 	password
         , 	gender
         , 	expectedStatus)
}


def static "com.katalon.extent.report.ExtentReport.attachLog"(
    	String details	) {
    (new com.katalon.extent.report.ExtentReport()).attachLog(
        	details)
}


def static "com.katalon.extent.report.ExtentReport.takeScreenshotFailure"(
    	TestCaseContext testCaseContext	) {
    (new com.katalon.extent.report.ExtentReport()).takeScreenshotFailure(
        	testCaseContext)
}


def static "com.katalon.extent.report.ExtentReport.deleteFolderContents"() {
    (new com.katalon.extent.report.ExtentReport()).deleteFolderContents()
}


def static "com.katalon.extent.report.ExtentReport.attachEReport"(
    	TestSuiteContext testSuiteContext	
     , 	String setDocumentTitle	
     , 	String setReportTitle	) {
    (new com.katalon.extent.report.ExtentReport()).attachEReport(
        	testSuiteContext
         , 	setDocumentTitle
         , 	setReportTitle)
}


def static "com.katalon.extent.report.ExtentReport.attachEReport"(
    	TestSuiteContext testSuiteContext	
     , 	String setDocumentTitle	
     , 	String setReportTitle	
     , 	String projectDir	) {
    (new com.katalon.extent.report.ExtentReport()).attachEReport(
        	testSuiteContext
         , 	setDocumentTitle
         , 	setReportTitle
         , 	projectDir)
}


def static "com.katalon.extent.report.ExtentReport.startEReport"(
    	TestCaseContext testCaseContext	) {
    (new com.katalon.extent.report.ExtentReport()).startEReport(
        	testCaseContext)
}


def static "com.katalon.extent.report.ExtentReport.getScreenshot"() {
    (new com.katalon.extent.report.ExtentReport()).getScreenshot()
}


def static "com.katalon.extent.report.ExtentReport.flushEReport"() {
    (new com.katalon.extent.report.ExtentReport()).flushEReport()
}


def static "com.katalon.extent.report.ExtentReport.addScreenshot"(
    	String newScreenshotpath	) {
    (new com.katalon.extent.report.ExtentReport()).addScreenshot(
        	newScreenshotpath)
}


def static "com.katalon.extent.report.ExtentReport.addScreenshot"() {
    (new com.katalon.extent.report.ExtentReport()).addScreenshot()
}
