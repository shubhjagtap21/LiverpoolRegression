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

WebUI.navigateToUrl(GlobalVariable.liverPoolOdtaqab)

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePageShubhum/Iniciar sesión_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLProduct], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePageShubhum/FirstProduct_plp'))

WebUI.click(findTestObject('pdp/AddToCart_pdp'))

WebUI.click(findTestObject('HomePageShubhum/Cart_header'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

DefaultAddress = WebUI.getText(findTestObject('Checkout/DefaultAddress_Checkout (1)'))

WebUI.navigateToUrl(GlobalVariable.liverPoolOdtaqab)

WebUI.callTestCase(findTestCase('CommonMethods/clickMyAccountFromHeader'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DemoObjects/checkoutpage/deliveryAddressHeading_address_opc'))

WebUI.callTestCase(findTestCase('CommonMethods/ClickDelivery_MyAccount'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/ClickAndCollectStores_accounts'))

WebUI.click(findTestObject('Checkout/3DotButton_Checkout'))

WebUI.click(findTestObject('AccountManagement/ClickNCollectionDefault_Account'))

TitleAddress = WebUI.getText(findTestObject('AccountManagement/ClickNCollectionAddressTitle_Account'))

if (TitleAddress == DefaultAddress) {
    Println('Checked')
}

WebUI.click(findTestObject('Checkout/AddAddressButtonPopup_checkout'))

WebUI.click(findTestObject('Checkout/AddressPopupCLickNCollect_Checkout'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Checkout/CheckAddressDefault_Checkout'), 0)

WebUI.verifyElementPresent(findTestObject('Checkout/ClickNCollectionRadioButton_Checkout'), 0)

WebUI.closeBrowser()

