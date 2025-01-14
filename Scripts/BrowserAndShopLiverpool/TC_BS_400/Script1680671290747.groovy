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

WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'tenis'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PLPPage/product_Link_plp'))

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

for (int i = 0; i < 1000; i += 7) {
    js.executeScript(('window.scrollTo(0, ' + i) + ')')
}

WebUI.verifyElementPresent(findTestObject('Object Repository/pdp/StickyProductImg_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/pdp/StickyProductName_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/pdp/StickyProductPrice_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/pdp/StickyProductColour_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/pdp/StickyProductPieces_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/pdp/StickyProductQuantity_pdp'), 0)

WebUI.closeBrowser()

