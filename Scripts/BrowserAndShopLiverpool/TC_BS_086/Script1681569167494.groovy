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

WebUI.navigateToUrl(GlobalVariable.LiverPoolURL)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.gwpBTParentWithVariantsSLGifts2], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('pdp/gwpRegaloLabel_pdp'), 0)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('pdp/colorSelectedOnLoad_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('1vedant/PDP/Size2_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('pdp/gwpGiftDropdown_pdp'), 0)

WebUI.click(findTestObject('pdp/gwpGiftDropdown_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('pdp/SelectGiftPurchaseRadioButton_pdp'), 0)

WebUI.click(findTestObject('pdp/closeGwpPopup_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PDP/Quantity(plus)_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('pdp/QuantityUpdatedTo2_pdp'), 0)

WebUI.click(findTestObject('pdp/gwpGiftDropdown_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('pdp/SelectGiftPurchaseRadioButton_pdp'), 0)

WebUI.click(findTestObject('pdp/closeGwpPopup_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PDP/Size2_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('pdp/gwpGiftDropdown_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('pdp/SelectGiftPurchaseRadioButton_pdp'), 0)

WebUI.click(findTestObject('pdp/closeGwpPopup_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1vedant/PDP/Size1_PDP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('pdp/gwpGiftDropdown_pdp'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('pdp/SelectGiftPurchaseRadioButton_pdp'), 0)
