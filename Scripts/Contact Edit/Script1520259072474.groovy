import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl('http://10.30.2.201/centreon/main.php?p=60301&o=c&contact_id=41')

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (4)/a_new'))

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (4)/td_Alias  Login'))

WebUI.setText(findTestObject('Page_Centreon - IT  Network Monitor (4)/input_contact_alias'), 'edited')

WebUI.setText(findTestObject('Page_Centreon - IT  Network Monitor (4)/input_contact_name'), 'edited')

WebUI.setText(findTestObject('Page_Centreon - IT  Network Monitor (4)/input_contact_email'), 'edited')

WebUI.click(findTestObject('Page_Centreon - IT  Network Monitor (4)/input_submitC'))

WebUI.closeBrowser()

