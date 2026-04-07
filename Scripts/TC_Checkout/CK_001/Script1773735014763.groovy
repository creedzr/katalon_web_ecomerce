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

WebUI.callTestCase(findTestCase('TC_Login/LG_001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('cart/Page_Swag Labs/button_Add to cart', [('productName') : 'sauce-labs-backpack']))

WebUI.verifyElementText(findTestObject('cart/Page_Swag Labs/Page_Swag Labs/cart'), '1')

WebUI.click(findTestObject('cart/Page_Swag Labs/button_Add to cart', [('productName') : 'sauce-labs-bike-light']))

WebUI.verifyElementText(findTestObject('cart/Page_Swag Labs/Page_Swag Labs/cart'), '2')

WebUI.click(findTestObject('cart/Page_Swag Labs/Page_Swag Labs/cart'))

WebUI.verifyElementText(findTestObject('cart/Page_Swag Labs/name_product', [('productName') : 'Sauce Labs Backpack']), 'Sauce Labs Backpack')

WebUI.verifyElementText(findTestObject('cart/Page_Swag Labs/name_product', [('productName') : 'Sauce Labs Bike Light']), 
    'Sauce Labs Bike Light')

WebUI.verifyElementText(findTestObject('cart/Page_Swag Labs/Page_Swag Labs/cart'), '2')

WebUI.closeBrowser()

