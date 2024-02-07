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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.selectOptionByValue(findTestObject('Object Repository/Chrome_Amazon_ValidateWishlist_Item_OR/Page_Online Shopping site in India Shop Onl_10c5f3/select_All Categories        Alexa Skills  _59be89'), 
    'search-alias=electronics', true)

WebUI.setText(findTestObject('Object Repository/Chrome_Amazon_ValidateWishlist_Item_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_field-keywords'), 
    'iphone 15')

WebUI.click(findTestObject('Object Repository/Chrome_Amazon_ValidateWishlist_Item_OR/Page_Online Shopping site in India Shop Onl_10c5f3/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Chrome_Amazon_ValidateWishlist_Item_OR/Page_Amazon.in  iphone 15/span_Apple iPhone 15 (256 GB) - Blue'))

WebUI.switchToWindowTitle('Apple iPhone 15 (256 GB) - Blue : Amazon.in: Electronics')

WebUI.click(findTestObject('Object Repository/Chrome_Amazon_ValidateWishlist_Item_OR/Page_Apple iPhone 15 (256 GB) - Blue  Amazo_937138/a_Add to Wish List'))

WebUI.closeBrowser()
