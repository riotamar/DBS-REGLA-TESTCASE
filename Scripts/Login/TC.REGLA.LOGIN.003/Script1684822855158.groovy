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

WebUI.navigateToUrl('https://shsdev-rw.southeastasia.cloudapp.azure.com:8082/login?to=/login')

WebUI.click(findTestObject('Object Repository/LOGIN/Username Password/USERNAME PASSWORD VALID/input_Please login to your account_p-inputt_ee1a72'))

WebUI.setText(findTestObject('Object Repository/LOGIN/Username Password/USERNAME PASSWORD VALID/input_Please login to your account_p-inputt_839be9'), 
    'rio04')

WebUI.setEncryptedText(findTestObject('Object Repository/LOGIN/Username Password/USERNAME PASSWORD VALID/input_Username_p-inputtext p-component p-filled'), 
    '6QjJ2wt5F0PN5KX+Gomc+A==')

WebUI.click(findTestObject('Object Repository/LOGIN/Username Password/USERNAME PASSWORD VALID/span_LOGIN'))

WebUI.click(findTestObject('Object Repository/LOGIN/Username Password/USERNAME PASSWORD VALID/span_R'))

WebUI.click(findTestObject('Object Repository/LOGIN/Username Password/USERNAME PASSWORD VALID/span_Logout'))

WebUI.closeBrowser()

