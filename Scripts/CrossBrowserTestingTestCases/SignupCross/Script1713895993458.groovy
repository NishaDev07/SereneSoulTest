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

WebUI.navigateToUrl('https://vtop.vit.ac.in/vtop/open/page')

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/i_Employee_fa fa-sign-in fa-3'))

WebUI.setText(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/input_VTOP Login_username'), 'SUNDHEEP2005')

WebUI.setEncryptedText(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/input_VTOP Login_password'), 
    'Yn58GQ4it9u0hPRLGUQ8oA==')

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/button_Submit'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/img_cars_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/img_cars_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/img_cars_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/img_cars_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/button_Verify'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/img_stairs_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/img_stairs_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/img_stairs_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/button_Verify'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/a_Digital Assignment Upload'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/select_-- ChooseSemester --Summer Semester _31d400'), 
    'VL20232405', true)

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/span_22MIS0035 (STUDENT)'))

WebUI.click(findTestObject('Object Repository/CrossBrowser/Page_VIT Vellore - VTOP/button_Sign out'))

WebUI.closeBrowser()

