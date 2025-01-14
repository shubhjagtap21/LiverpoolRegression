import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL2)

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('1HomePage/CategorasDropDown_HP'))

WebUI.click(findTestObject('1HomePage/L1_Category1_HP'))

'check for L3 category'
currentPage1 = WebUI.getText(findTestObject('1vedant/CLP/banner_1CLP'))

currentPage = currentPage1.toLowerCase()

System.out.println(currentPage)

'L2 CLP'
WebUI.click(findTestObject('1vedant/CLP/banner_1CLP'))

System.out.println(currentPage)

WebUI.callTestCase(findTestCase('CommonMethods/assertplp'), [:], FailureHandling.STOP_ON_FAILURE)

breadcrumb1 = WebUI.getText(findTestObject('1vedant/PLP/BreadCrumbCurrentPage_PLP'))

breadcrumb = breadcrumb1.toLowerCase()

System.out.println(breadcrumb)

if (currentPage == breadcrumb) {
    System.out.println('checked located to wanted page')
}

WebUI.closeBrowser()

