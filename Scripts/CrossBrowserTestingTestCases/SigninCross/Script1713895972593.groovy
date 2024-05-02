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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vtop.vit.ac.in/vtop/open/page')

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/strong_WINTER 202324 - REGULAR ARREARS REFA_71fc6b'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/strong_WINTER SEMESTER 2023-24 PHD SELF-STU_b14f4c'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/strong_HOSTEL VACATING CONSENT FORM FOR MBA_08f6c8'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/strong_HOSTEL ADMISSION REQUEST FORM FOR DA_911f8d'))

WebUI.switchToWindowTitle('VIT Vellore - VTOP')

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/strong_HOSTEL VACATING CONSENT FORM FOR PRO_2c475e'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/i_Employee_fa fa-sign-in fa-3'))

WebUI.setText(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/input_VTOP Login_username'), 'EMPLOYEE1')

WebUI.setEncryptedText(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/input_VTOP Login_password'), 
    '8SQVv/p9jVRYfSV/eMGvjg==')

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/button_Submit'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/div'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/button_Submit'))

WebUI.closeBrowser()

